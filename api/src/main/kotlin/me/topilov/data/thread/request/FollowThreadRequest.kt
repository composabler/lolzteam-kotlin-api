package me.topilov.data.thread.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class FollowThreadRequest(
    val threadId: Int,
    val email: Int? = null,
) : BatchRequest(
    uri = "threads/${threadId}/followers",
    method = HttpMethod.POST,
    params = mapOfNotNull(
        "email" to email,
    )
)