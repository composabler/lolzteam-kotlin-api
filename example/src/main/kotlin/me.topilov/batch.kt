package me.topilov

import kotlinx.coroutines.runBlocking
import me.topilov.data.profilePost.request.CreateProfilePostBatchRequest
import me.topilov.data.profilePost.response.CreateProfilePostResponse
import me.topilov.data.user.request.GetUserBatchRequest
import me.topilov.data.user.response.GetUserResponse

private val TOKEN = System.getenv("TOKEN")
private val USER_ID = System.getenv("USER_ID").toInt()

fun main() = runBlocking {

    val api = LolzApi(TOKEN)

    val userRequest = GetUserBatchRequest(
        id = "user",
        userId = USER_ID,
    )

    val postRequest = CreateProfilePostBatchRequest(
        id = "post",
        userId = USER_ID,
        postBody = "123",
    )

    val batchResponse = api.forumApiService.executeBatch(
        listOf(
            userRequest,
            postRequest,
        )
    )

    val userBatchResponse = batchResponse.jobs[userRequest.id] ?: return@runBlocking
    val userResponse = userBatchResponse.getData<GetUserResponse>()
    val user = userResponse.user ?: return@runBlocking
    val username = user.username

    val postBatchResponse = batchResponse.jobs[postRequest.id] ?: return@runBlocking
    val postResponse = postBatchResponse.getData<CreateProfilePostResponse>()
    val post = postResponse.profilePost ?: return@runBlocking
    val postId = post.id

    println("your username is $username and successfully create profile post with id $postId")
}