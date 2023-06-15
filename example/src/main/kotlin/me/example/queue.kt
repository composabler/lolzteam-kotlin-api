package me.example

import kotlinx.coroutines.*
import me.topilov.LolzApi

private val TOKEN = System.getenv("TOKEN")
private val USER_ID = System.getenv("USER_ID").toInt()

fun main(): Unit = runBlocking {
    val api = LolzApi(TOKEN)

    api.forumApiService.createThread(
        forumId = 876,
        threadTitle = "121323",
        postBody = "1213234"
    ).thread?.let { thread ->

        api.forumApiService.createPost(
            threadId = thread.id,
            postBody = "768"
        ).post?.let { post ->

            api.forumApiService.createPostComment(
                postId = post.id,
                commentBody = "987",
            )
        }
    }

}