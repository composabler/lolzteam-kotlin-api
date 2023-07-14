package me.topilov

import kotlinx.coroutines.runBlocking
import me.topilov.data.user.request.GetUserRequest
import me.topilov.data.user.request.GetUserGroupsRequest
import me.topilov.data.user.response.UserGroupsResponse
import me.topilov.data.user.response.UserResponse

private val TOKEN = System.getenv("TOKEN")
private val USER_ID = System.getenv("USER_ID").toInt()

fun main() = runBlocking {

    val api = LolzApi(TOKEN)

    val userRequest = GetUserRequest(
        userId = USER_ID,
    )

    val groupsRequest = GetUserGroupsRequest(
        userId = USER_ID
    )

    val batchResponse = api.forumApiService.executeBatch(
        listOf(
            userRequest,
            groupsRequest,
        )
    )

    val userResponse = batchResponse.getJob<UserResponse>(userRequest.id) ?: return@runBlocking
    val username = userResponse.user?.username

    val groupsResponse = batchResponse.getJob<UserGroupsResponse>(groupsRequest.id) ?: return@runBlocking
    val groups = groupsResponse.groups.size

    println("your username is $username and you have $groups groups")
}