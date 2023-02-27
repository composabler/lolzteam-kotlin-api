package me.topilov

import kotlinx.coroutines.runBlocking

private val TOKEN = System.getenv("TOKEN")
private val USER_ID = System.getenv("USER_ID").toInt()

fun main() = runBlocking {
    val api = LolzApi(TOKEN)
    val json = api.forumApiService.createProfilePost(USER_ID, "123")
    println(json)
}