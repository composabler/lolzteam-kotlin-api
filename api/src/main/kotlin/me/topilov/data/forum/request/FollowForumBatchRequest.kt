package me.topilov.data.forum.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class FollowForumBatchRequest(
    override val id: String,
    val forumId: Int,
    val post: Int? = null,
    val alert: Int? = null,
    val email: Int? = null,
) : BatchRequest(
    uri = "forums/${forumId}/followers",
    method = HttpMethod.POST,
    params = mapOfNotNull(
        "post" to post,
        "alert" to alert,
        "email" to email,
    )
)
