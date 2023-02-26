package me.topilov.service

import me.topilov.data.Result
import me.topilov.data.category.response.GetCategoriesResponse
import me.topilov.data.category.response.GetCategoryResponse
import me.topilov.data.forum.response.GetFollowedForums
import me.topilov.data.forum.response.GetForumFollowersResponse
import me.topilov.data.forum.response.GetForumResponse
import me.topilov.data.forum.response.GetForumsResponse
import me.topilov.data.notification.response.GetNotificationResponse
import me.topilov.data.notification.response.GetNotificationsResponse
import me.topilov.data.page.response.GetPageResponse
import me.topilov.data.page.response.GetPagesResponse
import me.topilov.data.post.comment.response.CreatePostCommentResponse
import me.topilov.data.post.comment.response.GetPostCommentsResponse
import me.topilov.data.profilePost.response.GetProfilePostLikesResponse
import me.topilov.data.profilePost.response.GetProfilePostResponse
import me.topilov.data.profilePost.comment.response.CreateProfilePostCommentResponse
import me.topilov.data.profilePost.comment.response.GetProfilePostCommentResponse
import me.topilov.data.profilePost.comment.response.GetProfilePostCommentsResponse
import me.topilov.data.profilePost.response.EditProfilePostResponse
import me.topilov.data.tag.response.FindTagsResponse
import me.topilov.data.tag.response.GetTaggedContentsResponse
import me.topilov.data.tag.response.GetTagsResponse
import me.topilov.data.thread.response.GetThreadPollResponse
import me.topilov.data.post.response.*
import me.topilov.data.thread.response.*
import me.topilov.data.user.response.*
import retrofit2.http.*

interface ForumApiService {

    @GET("categories")
    suspend fun getCategories(
        @Query("parent_category_id") parentCategoryId: Int? = null,
        @Query("parent_forum_id") parentForumId: Int? = null,
        @Query("order") order: String? = null,
    ): GetCategoriesResponse

    @GET("categories/{categoryId}")
    suspend fun getCategory(
        @Path("categoryId") categoryId: Int
    ): GetCategoryResponse

    @GET("forums")
    suspend fun getForums(
        @Query("parent_category_id") parentCategoryId: Int? = null,
        @Query("parent_forum_id") parentForumId: Int? = null,
        @Query("order") order: String? = null,
    ): GetForumsResponse

    @GET("forums/{forumId}")
    suspend fun getForum(
        @Path("forumId") forumId: Int
    ): GetForumResponse

    @GET("forums/{forumId}/followers")
    suspend fun getForumFollowers(
        @Path("forumId") forumId: Int
    ): GetForumFollowersResponse

    @POST("forums/{forumId}/followers")
    suspend fun followForum(
        @Path("forumId") forumId: Int,
        @Query("post") post: Int? = null,
        @Query("alert") alert: Int? = null,
        @Query("email") email: Int? = null,
    ): Result

    @DELETE("forums/{forumId}/followers")
    suspend fun unfollowForum(
        @Path("forumId") forumId: Int
    ): Result

    @GET("forums/followed")
    suspend fun getFollowedForums(
        @Query("total") total: Boolean? = null
    ): GetFollowedForums

    @GET("pages")
    suspend fun getPages(
        @Query("parent_page_id") parentPageId: Int? = null,
        @Query("order") order: String? = null,
    ): GetPagesResponse

    @GET("pages/{pageId}")
    suspend fun getPage(
        @Path("pageId") pageId: Int
    ): GetPageResponse

    @GET("threads")
    suspend fun getThreads(
        @Query("forum_id") forumId: Int? = null,
        @Query("thread_ids") threadIds: String? = null,
        @Query("creator_user_id") creatorUserId: Int? = null,
        @Query("sticky") sticky: Int? = null,
        @Query("thread_prefix_id") threadPrefixId: Int? = null,
        @Query("thread_tag_id") threadTagId: Int? = null,
        @Query("page") page: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("order") order: String? = null,
        @Query("thread_create_date") threadCreateDate: String? = null,
        @Query("thread_update_date") threadUpdateDate: String? = null,
    ): GetThreadsResponse

    @POST("threads")
    suspend fun createThread(
        @Query("forum_id") forumId: String,
        @Query("thread_title") threadTitle: String,
        @Query("post_body") postBody: String,
        @Query("thread_prefix_id") threadPrefixId: String? = null,
        @Query("thread_tags") threadTags: String? = null,
    ): CreateThreadResponse

    @DELETE("threads/attachments")
    suspend fun deleteThreadAttachment(
        @Query("forum_id") forumId: Int,
        @Query("attachment_id") attachmentId: Int,
        @Query("attachment_hash") attachmentHash: String? = null,
    ): Result

    @GET("threads/{threadId}")
    suspend fun getThread(
        @Path("threadId") threadId: Int
    ): GetThreadResponse

    @DELETE("threads/{threadId}")
    suspend fun deleteThread(
        @Path("threadId") threadId: Int,
        @Query("reason") reason: String? = null,
    ): Result

    @GET("threads/{threadId}/followers")
    suspend fun getThreadFollowers(
        @Path("threadId") threadId: Int
    ): GetThreadFollowersResponse

    @POST("threads/{threadId}/followers")
    suspend fun followThread(
        @Path("threadId") threadId: Int,
        @Query("email") email: Int? = null,
    ): Result

    @DELETE("threads/{threadId}/followers")
    suspend fun unfollowThread(
        @Path("threadId") threadId: Int
    ): Result

    @GET("threads/followed")
    suspend fun getFollowedThreads(
        @Query("limit") limit: Int? = null,
        @Query("total") total: Boolean? = null,
    ): GetFollowedThreadsResponse

    @GET("threads/{threadId}/poll")
    suspend fun getThreadPoll(
        @Path("threadId") threadId: Int,
    ): GetThreadPollResponse

    @POST("threads/{threadId}/poll/votes")
    suspend fun voteThreadPoll(
        @Path("threadId") threadId: Int,
        @Query("response_id") responseId: Int,
        @Query("response_ids") responseIds: String? = null,
    ): Result

    @GET("threads/new")
    suspend fun getUnreadThreads(
        @Query("limit") limit: Int? = null,
        @Query("forum_id") forumId: Int? = null,
        @Query("data_limit") dataLimit: Int? = null,
    ): GetUnreadThreadsResponse

    @GET("threads/recent")
    suspend fun getRecentThreads(
        @Query("days") days: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("forum_id") forumId: Int? = null,
        @Query("data_limit") dataLimit: Int? = null,
    ): GetRecentThreadsResponse

    @GET("posts")
    suspend fun getPosts(
        @Query("thread_id") threadId: Int? = null,
        @Query("page_of_post_id") pagePostId: Int? = null,
        @Query("post_ids") postIds: String? = null,
        @Query("page") page: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("order") order: String? = null,
    ): GetPostsResponse

    @POST("posts")
    suspend fun createPost(
        @Query("thread_id") threadId: Int,
        @Query("post_body") postBody: String? = null,
        @Query("quote_post_id") quotePostId: Int? = null,
    ): CreatePostResponse

    @GET("posts/{postId}")
    suspend fun getPost(
        @Path("postId") postId: Int,
    ): GetPostResponse

    @PUT("posts/{postId}")
    suspend fun editPost(
        @Path("postId") postId: Int,
        @Query("post_body") postBody: String,
        @Query("thread_title") threadTitle: String? = null,
        @Query("thread_prefix_id") threadPrefixId: Int? = null,
        @Query("thread_tags") threadTags: String? = null,
        @Query("thread_node_id") threadNodeId: Int? = null,
    ): EditPostResponse

    @DELETE("posts/{postId}")
    suspend fun deletePost(
        @Path("postId") postId: Int,
        @Query("reason") reason: String? = null,
    ): Result

    @DELETE("posts/{postId}/attachments/{attachmentId}")
    suspend fun deletePostAttachment(
        @Path("postId") postId: String,
        @Path("attachmentId") attachmentId: String,
        @Query("thread_id") threadId: String? = null,
        @Query("attachment_hash") attachmentHash: String? = null,
    ): Result

    @GET("posts/{postId}/likes")
    suspend fun getPostLikes(
        @Path("postId") postId: Int,
        @Query("page") page: Int? = null,
        @Query("limit") limit: Int? = null,
    ): GetPostLikesResponse

    @POST("posts/{postId}/likes")
    suspend fun likePost(
        @Path("postId") postId: Int,
    ): Result

    @DELETE("posts/{postId}/likes")
    suspend fun unlikePost(
        @Path("postId") postId: Int,
    ): Result

    @POST("posts/{postId}/report")
    suspend fun reportPost(
        @Path("postId") postId: Int,
        @Field("message") message: String,
    ): Result

    @GET("posts/{postId}/comments")
    suspend fun getPostComments(
        @Path("postId") postId: Int,
        @Query("before") before: Long? = null,
    ): GetPostCommentsResponse

    @POST("/posts/{postId}/comments")
    suspend fun createPostComment(
        @Path("postId") postId: Int,
        @Query("comment_body") commentBody: String,
    ): CreatePostCommentResponse

    @GET("/tags/list")
    suspend fun getTags(
        @Query("page") page: Int? = null,
        @Query("limit") limit: Int? = null,
    ): GetTagsResponse

    @GET("/tags/{tagId}")
    suspend fun getTaggedContents(
        @Path("tagId") tagId: Int,
        @Query("page") page: Int? = null,
        @Query("limit") limit: Int? = null,
    ): GetTaggedContentsResponse

    @GET("/tags/find")
    suspend fun findTags(
        @Query("tag") tag: String
    ): FindTagsResponse

    @GET("/users")
    suspend fun getUsers(
        @Query("page") page: Int? = null,
        @Query("limit") limit: Int? = null,
    ): GetUsersResponse

    @POST("/users")
    suspend fun createUser(
        @Query("user_email") userEmail: String,
        @Query("username") username: String,
        @Query("password") password: String,
        @Query("password_algo") passwordAlgo: String? = null,
        @Query("user_dob_day") userDobDay: Int? = null,
        @Query("user_dob_month") userDobMonth: Int? = null,
        @Query("user_dob_year") userDobYear: Int? = null,
        @Query("fields") fields: String? = null,
        @Query("client_id") clientId: Int? = null,
        @Query("extra_data") extraData: String? = null,
    ): Result

    @GET("/users/fields")
    suspend fun getUserFields(): GetUserFieldsResponse

    @GET("/users/find")
    suspend fun findUsers(
        @Query("username") username: String? = null,
        @Query("user_email") userEmail: String? = null,
        @Query("custom_fields") customFields: String? = null,
    ): FindUsersResponse

    @GET("users/{userId}")
    suspend fun getUser(
        @Path("userId") userId: Int,
    ): GetUserResponse

    @PUT("/users/{userId}")
    suspend fun editUser(
        @Path("userId") userId: Int,
        @Query("password") password: String? = null,
        @Query("password_old") passwordOld: String? = null,
        @Query("password_algo") passwordAlgo: String? = null,
        @Query("user_email") userEmail: String? = null,
        @Query("username") username: String? = null,
        @Query("user_title") userTitle: String? = null,
        @Query("primary_group_id") primaryGroupId: Int? = null,
        @Query("secondary_group_ids") secondaryGroupIds: String? = null,
        @Query("user_dob_day") userDobDay: Int? = null,
        @Query("user_dob_month") userDobMonth: Int? = null,
        @Query("user_dob_year") userDobYear: Int? = null,
        @Query("fields") fields: String? = null
    ): Result

    @POST("lost-password")
    suspend fun lostPassword(
        @Query("oauth_token") oauthToken: String,
        @Query("username") username: String? = null,
        @Query("email") email: String? = null
    ): Result

    @POST("users/{userId}/avatar")
    suspend fun uploadAvatar(
        @Path("userId") userId: Int,
        @Query("avatar") avatar: String,
    ): Result

    @DELETE("users/{userId}/avatar")
    suspend fun deleteAvatar(
        @Path("userId") userId: Int
    ): Result

    @GET("users/{userId}/followers")
    suspend fun getUserFollowers(
        @Path("userId") userId: Int,
        @Query("order") order: String? = null,
        @Query("page") page: Int? = null,
        @Query("limit") limit: Int? = null
    ): GetUserFollowersResponse

    @POST("users/{userId}/followers")
    suspend fun followUser(
        @Path("userId") userId: Int
    ): Result

    @DELETE("users/{userId}/followers")
    suspend fun unfollowUser(
        @Path("userId") userId: Int
    ): Result

    @GET("users/{userId}/followings")
    suspend fun getFollowingsUsers(
        @Path("userId") userId: Int,
        @Query("order") order: String? = null,
        @Query("page") page: Int? = null,
        @Query("limit") limit: Int? = null,
    ): GetFollowingsUsersResponse

    @GET("users/ignored")
    suspend fun getIgnoredUsers(
        @Query("total") total: Int? = null
    ): GetIgnoredUsersResponse

    @POST("users/{userId}/ignore")
    suspend fun ignoreUser(
        @Path("userId") userId: Int
    ): Result

    @DELETE("users/{userId}/ignore")
    suspend fun stopIgnoreUser(
        @Path("userId") userId: Int
    ): Result

    @GET("users/groups")
    suspend fun getAllGroups(): GetAllGroupsResponse

    @GET("users/{userId}/groups")
    suspend fun getUserGroups(
        @Path("userId") userId: Int
    ): GetUserGroupsResponse

    @GET("profile-posts/{profilePostId}")
    suspend fun getProfilePost(
        @Path("profilePostId") profilePostId: Int
    ): GetProfilePostResponse

    @PUT("profile-posts/{profilePostId}")
    suspend fun editProfilePost(
        @Path("profilePostId") profilePostId: Int,
        @Query("post_body") postBody: String? = null
    ): EditProfilePostResponse

    @DELETE("profile-posts/{profilePostId}")
    suspend fun deleteProfilePost(
        @Path("profilePostId") profilePostId: Int,
        @Query("reason") reason: String? = null,
    ): Result

    @GET("profile-posts/{profilePostId}/likes")
    suspend fun getProfilePostLikes(
        @Path("profilePostId") profilePostId: Int
    ): GetProfilePostLikesResponse

    @POST("profile-posts/{profilePostId}/likes")
    suspend fun likeProfilePost(
        @Path("profilePostId") profilePostId: Int
    ): Result

    @DELETE("profile-posts/{profilePostId}/likes")
    suspend fun unlikeProfilePost(
        @Path("profilePostId") profilePostId: Int
    ): Result

    @GET("profile-posts/{profilePostId}/comments")
    suspend fun getProfilePostComments(
        @Path("profilePostId") profilePostId: Int,
        @Query("before") before: String? = null
    ): GetProfilePostCommentsResponse

    @POST("profile-posts/{profilePostId}/comments")
    suspend fun createProfilePostComment(
        @Path("profilePostId") profilePostId: Int,
        @Query("comment_body") commentBody: String,
    ): CreateProfilePostCommentResponse

    @GET("profile-posts/{profilePostId}/comments/{commentId}")
    suspend fun getProfilePostComment(
        @Path("profilePostId") profilePostId: Int,
        @Path("commentId") commentId: Int
    ): GetProfilePostCommentResponse

    @DELETE("profile-posts/{profilePostId}/comments/{commentId}")
    suspend fun deleteProfilePostComment(
        @Path("profilePostId") profilePostId: Int,
        @Path("commentId") commentId: Int,
    ): Result

    @POST("profile-posts/{profilePostId}/report")
    suspend fun reportProfilePost(
        @Path("profilePostId") profilePostId: Int,
        @Query("message") message: String
    ): Result

    @POST("notifications/read")
    suspend fun readNotification(
        @Query("notification_id") notificationId: Int? = null
    ): Result

    @GET("notifications")
    suspend fun getNotifications(): GetNotificationsResponse

    @GET("notifications/{notificationId}/content")
    suspend fun getNotification(
        @Path("notificationId") notificationId: Int
    ): GetNotificationResponse

    @POST("notifications/custom")
    suspend fun sendNotification(
        @Query("user_id") userId: Int,
        @Query("message") message: String,
        @Query("notification_type") notificationType: String? = null,
        @Query("extra_data") extraData: String? = null,
    ): Result
}