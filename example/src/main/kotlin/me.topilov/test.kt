package me.topilov

import kotlinx.coroutines.runBlocking
import me.topilov.data.user.request.GetUserBatchRequest
import me.topilov.data.user.response.GetUserResponse

private val TOKEN = System.getenv("TOKEN")
private val USER_ID = System.getenv("USER_ID").toInt()

fun main() = runBlocking {
    val api = LolzApi(TOKEN)
}