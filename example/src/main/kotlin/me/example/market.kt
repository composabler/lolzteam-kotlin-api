package me.example

import kotlinx.coroutines.runBlocking
import me.topilov.LolzApi

private val TOKEN = System.getenv("TOKEN")
private val USER_ID = System.getenv("USER_ID").toInt()

fun main() = runBlocking {
    val api = LolzApi(TOKEN)

    println(api.marketApiService.getLatestAccounts())
}