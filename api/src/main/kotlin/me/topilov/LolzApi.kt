package me.topilov

import com.fasterxml.jackson.databind.JsonNode
import mapper
import me.topilov.data.Result
import me.topilov.data.accounts.response.AccountsResponse
import me.topilov.data.batch.BatchRequest
import me.topilov.data.batch.BatchResponse
import me.topilov.data.category.response.CategoriesResponse
import me.topilov.data.category.response.CategoryResponse
import me.topilov.data.contents.response.ContentsResponse
import me.topilov.data.forum.response.FollowedForumsResponse
import me.topilov.data.forum.response.ForumFollowersResponse
import me.topilov.data.forum.response.ForumResponse
import me.topilov.data.forum.response.ForumsResponse
import me.topilov.data.notification.response.NotificationResponse
import me.topilov.data.notification.response.NotificationsResponse
import me.topilov.data.page.response.PageResponse
import me.topilov.data.page.response.PagesResponse
import me.topilov.data.post.comment.response.CreatePostCommentResponse
import me.topilov.data.post.comment.response.GetPostCommentsResponse
import me.topilov.data.post.response.*
import me.topilov.data.profilePost.comment.response.CreateProfilePostCommentResponse
import me.topilov.data.profilePost.comment.response.ProfilePostCommentResponse
import me.topilov.data.profilePost.comment.response.ProfilePostCommentsResponse
import me.topilov.data.profilePost.response.CreateProfilePostResponse
import me.topilov.data.profilePost.response.EditProfilePostResponse
import me.topilov.data.profilePost.response.GetProfilePostResponse
import me.topilov.data.profilePost.response.ProfilePostLikesResponse
import me.topilov.data.proxy.response.ProxyResponse
import me.topilov.data.search.response.SearchPostsResponse
import me.topilov.data.search.response.SearchResponse
import me.topilov.data.search.response.SearchTaggedResponse
import me.topilov.data.search.response.SearchThreadsResponse
import me.topilov.data.tag.response.FindTagsResponse
import me.topilov.data.tag.response.TaggedContentsResponse
import me.topilov.data.tag.response.TagsResponse
import me.topilov.data.thread.response.*
import me.topilov.data.user.response.*
import me.topilov.interceptor.AuthInterceptor
import me.topilov.interceptor.RateLimitInterceptor
import me.topilov.service.ForumApiService
import me.topilov.service.MarketApiService
import okhttp3.MultipartBody
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import java.util.concurrent.TimeUnit

class LolzApi(
    token: String,
    forumApiUrl: String = "https://api.zelenka.guru",
    marketApiUrl: String = "https://api.lzt.market",
) {

    private val authInterceptor = AuthInterceptor(token)
    private val rateLimitInterceptor = RateLimitInterceptor()

    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(authInterceptor)
        .addInterceptor(rateLimitInterceptor)
        .readTimeout(30, TimeUnit.SECONDS)
        .connectTimeout(30, TimeUnit.SECONDS)
        .callTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()

    private val forumRetrofit = Retrofit.Builder()
        .baseUrl(forumApiUrl)
        .client(okHttpClient)
        .addConverterFactory(JacksonConverterFactory.create(mapper))
        .build()

    private val marketRetrofit = Retrofit.Builder()
        .baseUrl(marketApiUrl)
        .client(okHttpClient)
        .addConverterFactory(JacksonConverterFactory.create(mapper))
        .build()

    private val forumApiService: ForumApiService = forumRetrofit.create(ForumApiService::class.java)

    private val marketApiService: MarketApiService = marketRetrofit.create(MarketApiService::class.java)

    suspend fun executeForumBatch(batchRequest: List<@JvmSuppressWildcards BatchRequest>): BatchResponse {
        return forumApiService.executeBatch(batchRequest)
    }

    suspend fun getCategories(
        parentCategoryId: Int? = null,
        parentForumId: Int? = null,
        order: String? = null,
    ): CategoriesResponse {
        return forumApiService.getCategories(parentCategoryId, parentForumId, order)
    }

    suspend fun getCategory(categoryId: Int): CategoryResponse {
        return forumApiService.getCategory(categoryId)
    }

    suspend fun getForums(
        parentCategoryId: Int? = null,
        parentForumId: Int? = null,
        order: String? = null,
    ): ForumsResponse {
        return forumApiService.getForums(parentCategoryId, parentForumId, order)
    }

    suspend fun getForum(forumId: Int): ForumResponse {
        return forumApiService.getForum(forumId)
    }

    suspend fun getForumFollowers(forumId: Int): ForumFollowersResponse {
        return forumApiService.getForumFollowers(forumId)
    }

    suspend fun followForum(
        forumId: Int,
        post: Int? = null,
        alert: Int? = null,
        email: Int? = null,
    ): Result {
        return forumApiService.followForum(forumId, post, alert, email)
    }

    suspend fun unfollowForum(forumId: Int): Result {
        return forumApiService.unfollowForum(forumId)
    }

    suspend fun getFollowedForums(total: Boolean? = null): FollowedForumsResponse {
        return forumApiService.getFollowedForums(total)
    }

    suspend fun getPages(
        parentPageId: Int? = null,
        order: String? = null
    ): PagesResponse {
        return forumApiService.getPages(parentPageId, order)
    }

    suspend fun getPage(pageId: Int): PageResponse {
        return forumApiService.getPage(pageId)
    }

    suspend fun getThreads(
        forumId: Int? = null,
        threadIds: String? = null,
        creatorUserId: Int? = null,
        sticky: Int? = null,
        threadPrefixId: Int? = null,
        threadTagId: Int? = null,
        page: Int? = null,
        limit: Int? = null,
        order: String? = null,
        threadCreateDate: String? = null,
        threadUpdateDate: String? = null,
    ): ThreadsResponse {
        return forumApiService.getThreads(
            forumId,
            threadIds,
            creatorUserId,
            sticky,
            threadPrefixId,
            threadTagId,
            page,
            limit,
            order,
            threadCreateDate,
            threadUpdateDate
        )
    }

    suspend fun createThread(
        forumId: Int,
        threadTitle: String,
        postBody: String,
        threadPrefixId: Int? = null,
        threadTags: String? = null,
    ): CreateThreadResponse {
        return forumApiService.createThread(forumId, threadTitle, postBody, threadPrefixId, threadTags)
    }

    suspend fun getThread(threadId: Int): ThreadResponse {
        return forumApiService.getThread(threadId)
    }

    suspend fun deleteThread(threadId: Int, reason: String? = null): Result {
        return forumApiService.deleteThread(threadId, reason)
    }

    suspend fun getThreadFollowers(threadId: Int): ThreadFollowersResponse {
        return forumApiService.getThreadFollowers(threadId)
    }

    suspend fun followThread(threadId: Int, email: Int? = null): Result {
        return forumApiService.followThread(threadId, email)
    }

    suspend fun unfollowThread(threadId: Int): Result {
        return forumApiService.unfollowThread(threadId)
    }

    suspend fun getFollowedThreads(
        limit: Int? = null,
        total: Boolean? = null,
    ): FollowedThreadsResponse {
        return forumApiService.getFollowedThreads(limit, total)
    }

    suspend fun getThreadPoll(threadId: Int): ThreadPollResponse {
        return forumApiService.getThreadPoll(threadId)
    }

    suspend fun voteThreadPoll(
        threadId: Int,
        responseId: Int,
        responseIds: String? = null
    ): Result {
        return forumApiService.voteThreadPoll(threadId, responseId, responseIds)
    }

    suspend fun getUnreadThreads(
        limit: Int? = null,
        forumId: Int? = null,
        dataLimit: Int? = null,
    ): UnreadThreadsResponse {
        return forumApiService.getUnreadThreads(limit, forumId, dataLimit)
    }

    suspend fun getRecentThreads(
        days: Int? = null,
        limit: Int? = null,
        forumId: Int? = null,
        dataLimit: Int? = null,
    ): RecentThreadsResponse {
        return forumApiService.getRecentThreads(days, limit, forumId, dataLimit)
    }

    suspend fun getPosts(
        threadId: Int? = null,
        pagePostId: Int? = null,
        postIds: String? = null,
        page: Int? = null,
        limit: Int? = null,
        order: String? = null,
    ): PostsResponse {
        return forumApiService.getPosts(threadId, pagePostId, postIds, page, limit, order)
    }

    suspend fun createPost(
        threadId: Int,
        postBody: String? = null,
        quotePostId: Int? = null,
    ): CreatePostResponse {
        return forumApiService.createPost(threadId, postBody, quotePostId)
    }

    suspend fun getPost(postId: Int): PostResponse {
        return forumApiService.getPost(postId)
    }

    suspend fun editPost(
        postId: Int,
        postBody: String,
        threadTitle: String? = null,
        threadPrefixId: Int? = null,
        threadTags: String? = null,
        threadNodeId: Int? = null,
    ): EditPostResponse {
        return forumApiService.editPost(postId, postBody, threadTitle, threadPrefixId, threadTags, threadNodeId)
    }

    suspend fun deletePost(postId: Int, reason: String? = null): Result {
        return forumApiService.deletePost(postId, reason)
    }

    suspend fun getPostLikes(
        postId: Int,
        page: Int? = null,
        limit: Int? = null,
    ): PostLikesResponse {
        return forumApiService.getPostLikes(postId, page, limit)
    }

    suspend fun likePost(postId: Int): Result {
        return forumApiService.likePost(postId)
    }

    suspend fun unlikePost(postId: Int): Result {
        return forumApiService.unlikePost(postId)
    }

    suspend fun reportPost(postId: Int, message: String): Result {
        return forumApiService.reportPost(postId, message)
    }

    suspend fun getPostComments(postId: Int, before: Long? = null): GetPostCommentsResponse {
        return forumApiService.getPostComments(postId, before)
    }

    suspend fun createPostComment(postId: Int, commentBody: String): CreatePostCommentResponse {
        return forumApiService.createPostComment(postId, commentBody)
    }

    suspend fun getTags(
        page: Int? = null,
        limit: Int? = null,
    ): TagsResponse {
        return forumApiService.getTags(page, limit)
    }

    suspend fun getTaggedContents(
        tagId: Int,
        page: Int? = null,
        limit: Int? = null,
    ): TaggedContentsResponse {
        return forumApiService.getTaggedContents(tagId, page, limit)
    }

    suspend fun findTags(tag: String): FindTagsResponse {
        return forumApiService.findTags(tag)
    }

    suspend fun getUsers(
        page: Int? = null,
        limit: Int? = null,
    ): UsersResponse {
        return forumApiService.getUsers(page, limit)
    }

    suspend fun getUser(userId: Int): UserResponse {
        return forumApiService.getUser(userId)
    }

    suspend fun editUser(
        userId: Int,
        password: String? = null,
        passwordOld: String? = null,
        passwordAlgo: String? = null,
        userEmail: String? = null,
        username: String? = null,
        userTitle: String? = null,
        primaryGroupId: Int? = null,
        secondaryGroupIds: String? = null,
        userDobDay: Int? = null,
        userDobMonth: Int? = null,
        userDobYear: Int? = null,
        fields: String? = null,
    ): Result {
        return forumApiService.editUser(
            userId,
            password,
            passwordOld,
            passwordAlgo,
            userEmail,
            username,
            userTitle,
            primaryGroupId,
            secondaryGroupIds,
            userDobDay,
            userDobMonth,
            userDobYear,
            fields
        )
    }

    suspend fun createUser(
        userEmail: String,
        username: String,
        password: String,
        passwordAlgo: String? = null,
        userDobDay: String? = null,
        userDobMonth: String? = null,
        userDobYear: String? = null,
        fields: String? = null,
        clientId: String? = null,
        extraData: String? = null,
        extraTimestamp: String? = null,
    ): CreateUserResponse {
        return forumApiService.createUser(
            userEmail,
            username,
            password,
            passwordAlgo,
            userDobDay,
            userDobMonth,
            userDobYear,
            fields,
            clientId,
            extraData,
            extraTimestamp,
        )
    }

    suspend fun getUserFields(): UserFieldsResponse {
        return forumApiService.getUserFields()
    }

    suspend fun findUsers(
        username: String? = null,
        userEmail: String? = null,
        customFields: String? = null,
    ): FindUsersResponse {
        return forumApiService.findUsers(username, userEmail, customFields)
    }

    suspend fun lostPassword(
        oauthToken: String,
        username: String? = null,
        email: String? = null,
    ): Result {
        return forumApiService.lostPassword(oauthToken, username, email)
    }

    suspend fun uploadAvatar(userId: Int, avatar: MultipartBody.Part): Result {
        return forumApiService.uploadAvatar(userId, avatar)
    }

    suspend fun deleteAvatar(userId: Int): Result {
        return forumApiService.deleteAvatar(userId)
    }

    suspend fun getUserFollowers(
        userId: Int,
        order: String? = null,
        page: Int? = null,
        limit: Int? = null,
    ): UserFollowersResponse {
        return forumApiService.getUserFollowers(userId, order, page, limit)
    }

    suspend fun followUser(userId: Int): Result {
        return forumApiService.followUser(userId)
    }

    suspend fun unfollowUser(userId: Int): Result {
        return forumApiService.unfollowUser(userId)
    }

    suspend fun getFollowingsUsers(
        userId: Int,
        order: String? = null,
        page: Int? = null,
        limit: Int? = null,
    ): FollowingsUsersResponse {
        return forumApiService.getFollowingsUsers(userId, order, page, limit)
    }

    suspend fun getIgnoredUsers(total: Int? = null): IgnoredUsersResponse {
        return forumApiService.getIgnoredUsers(total)
    }

    suspend fun ignoreUser(userId: Int): Result {
        return forumApiService.ignoreUser(userId)
    }

    suspend fun stopIgnoreUser(userId: Int): Result {
        return forumApiService.stopIgnoreUser(userId)
    }

    suspend fun getAllGroups(): AllGroupsResponse {
        return forumApiService.getAllGroups()
    }

    suspend fun getUserGroups(userId: Int): UserGroupsResponse {
        return forumApiService.getUserGroups(userId)
    }

    suspend fun createProfilePost(
        userId: Int,
        postBody: String,
        status: String? = null,
    ): CreateProfilePostResponse {
        return forumApiService.createProfilePost(userId, postBody, status)
    }

    suspend fun getContents(
        userId: Int,
        page: Int? = null,
        limit: Int? = null,
    ): ContentsResponse {
        return forumApiService.getContents(userId, page, limit)
    }

    suspend fun getProfilePost(profilePostId: Int): GetProfilePostResponse {
        return forumApiService.getProfilePost(profilePostId)
    }

    suspend fun editProfilePost(profilePostId: Int, postBody: String? = null): EditProfilePostResponse {
        return forumApiService.editProfilePost(profilePostId, postBody)
    }

    suspend fun deleteProfilePost(profilePostId: Int, reason: String? = null): Result {
        return forumApiService.deleteProfilePost(profilePostId, reason)
    }

    suspend fun getProfilePostLikes(profilePostId: Int): ProfilePostLikesResponse {
        return forumApiService.getProfilePostLikes(profilePostId)
    }

    suspend fun likeProfilePost(profilePostId: Int): Result {
        return forumApiService.likeProfilePost(profilePostId)
    }

    suspend fun unlikeProfilePost(profilePostId: Int): Result {
        return forumApiService.unlikeProfilePost(profilePostId)
    }

    suspend fun getProfilePostComments(profilePostId: Int, before: String? = null): ProfilePostCommentsResponse {
        return forumApiService.getProfilePostComments(profilePostId, before)
    }

    suspend fun createProfilePostComment(profilePostId: Int, commentBody: String): CreateProfilePostCommentResponse {
        return forumApiService.createProfilePostComment(profilePostId, commentBody)
    }

    suspend fun getProfilePostComment(profilePostId: Int, commentId: Int): ProfilePostCommentResponse {
        return forumApiService.getProfilePostComment(profilePostId, commentId)
    }

    suspend fun deleteProfilePostComment(profilePostId: Int, commentId: Int): Result {
        return forumApiService.deleteProfilePostComment(profilePostId, commentId)
    }

    suspend fun reportProfilePost(profilePostId: Int, message: String): Result {
        return forumApiService.reportProfilePost(profilePostId, message)
    }

    suspend fun readNotification(notificationId: Int? = null): Result {
        return forumApiService.readNotification(notificationId)
    }

    suspend fun getNotifications(): NotificationsResponse {
        return forumApiService.getNotifications()
    }

    suspend fun getNotification(notificationId: Int): NotificationResponse {
        return forumApiService.getNotification(notificationId)
    }

    suspend fun sendNotification(
        userId: Int,
        message: String,
        notificationType: String? = null,
        extraData: String? = null,
    ): Result {
        return forumApiService.sendNotification(userId, message, notificationType, extraData)
    }

    suspend fun searchThreads(
        query: String? = null,
        tag: String? = null,
        forumId: Int? = null,
        userId: Int? = null,
        page: Int? = null,
        limit: Int? = null,
        dataLimit: Int? = null,
    ): SearchThreadsResponse {
        return forumApiService.searchThreads(query, tag, forumId, userId, page, limit, dataLimit)
    }

    suspend fun searchPosts(
        query: String? = null,
        tag: String? = null,
        forumId: Int? = null,
        userId: Int? = null,
        page: Int? = null,
        limit: Int? = null,
    ): SearchPostsResponse {
        return forumApiService.searchPosts(query, tag, forumId, userId, page, limit)
    }

    suspend fun search(
        query: String? = null,
        tag: String? = null,
        forumId: Int? = null,
        userId: Int? = null,
        page: Int? = null,
        limit: Int? = null,
    ): SearchResponse {
        return forumApiService.search(query, tag, forumId, userId, page, limit)
    }

    suspend fun searchTagged(
        tag: String? = null,
        tags: List<String>? = null,
        page: Int? = null,
        limit: Int? = null,
    ): SearchTaggedResponse {
        return forumApiService.searchTagged(tag, tags, page, limit)
    }

    suspend fun executeMarketBatch(batchRequest: List<@JvmSuppressWildcards BatchRequest>): BatchResponse {
        return marketApiService.executeBatch(batchRequest)
    }

    suspend fun getLatestAccounts(): AccountsResponse {
        return marketApiService.getLatestAccounts()
    }

    suspend fun getCategoryAccounts(
        categoryName: String,
        minPrice: Int? = null,
        maxPrice: Int? = null,
        title: String? = null,
        parseStickyItems: Boolean? = null,
        parseSameItems: Boolean? = null,
        game: List<Int>? = null,
        page: Int? = null,
        optionalCategoryParameters: Map<String, String> = emptyMap(),
    ): AccountsResponse {
        return marketApiService.getCategoryAccounts(
            categoryName,
            minPrice,
            maxPrice,
            title,
            parseStickyItems,
            parseSameItems,
            game,
            page,
            optionalCategoryParameters
        )
    }

    suspend fun getFavoriteAccounts(): AccountsResponse {
        return marketApiService.getFavoriteAccounts()
    }

    suspend fun getAccount(itemId: Int): JsonNode {
        return marketApiService.getAccount(itemId)
    }

    suspend fun getMyUser(): JsonNode {
        return marketApiService.getMyUser()
    }

    suspend fun changeSettings(
        disableSteamGuard: Boolean? = null,
        userAllowAskDiscount: Boolean? = null,
        maxDiscountPercent: Int? = null,
        allowAcceptAccounts: String? = null,
        hideFavourites: Boolean? = null
    ): Result {
        return marketApiService.changeSettings(
            disableSteamGuard,
            userAllowAskDiscount,
            maxDiscountPercent,
            allowAcceptAccounts,
            hideFavourites
        )
    }

    suspend fun getProxy(): ProxyResponse {
        return marketApiService.getProxy()
    }

    suspend fun addSingleProxy(
        proxyIp: String,
        proxyPort: Int,
        proxyUser: String,
        proxyPassword: String
    ): Result {
        return marketApiService.addSingleProxy(proxyIp, proxyPort, proxyUser, proxyPassword)
    }

    suspend fun addMultiProxy(proxyRow: String): Result {
        return marketApiService.addMultiProxy(proxyRow)
    }

    suspend fun deleteProxy(proxyId: Int? = null, deleteAll: Boolean? = null): Result {
        return marketApiService.deleteProxy(proxyId, deleteAll)
    }
}