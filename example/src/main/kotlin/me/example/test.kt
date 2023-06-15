package me.topilov

import kotlinx.coroutines.runBlocking

private val TOKEN = System.getenv("TOKEN")
private val USER_ID = System.getenv("USER_ID").toInt()

fun main() = runBlocking {
    val api = LolzApi(TOKEN)
    val result = api.marketApiService.getMyUser()
    println(result)
}