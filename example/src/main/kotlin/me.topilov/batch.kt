package me.topilov

import kotlinx.coroutines.runBlocking
import mapper
import me.topilov.data.batch.BatchRequest
import me.topilov.data.batch.BatchRequestJob
import me.topilov.data.user.response.GetUserResponse

private val TOKEN = System.getenv("TOKEN")
private val USER_ID = System.getenv("USER_ID").toInt()

fun main() = runBlocking {
    val api = LolzApi(TOKEN)
    val response = api.forumApiService.executeBatch(
        listOf(
            BatchRequestJob(
                id = "user",
                uri = "https://api.zelenka.guru/users/$USER_ID",
                method = "GET",
                params = mapOf(),
            ),
            BatchRequestJob(
                id = "notifications",
                uri = "https://api.zelenka.guru/notifications",
                method = "GET",
                params = mapOf(),
            )
        )
    )

    val rawUserResponse = response.jobs["user"] ?: return@runBlocking
    val userResponse = rawUserResponse.getData<GetUserResponse>()
    val user = userResponse.user ?: return@runBlocking

    println(user.username)
}