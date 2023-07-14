package me.topilov.data.post.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class ReportPostRequest(
    val postId: Int,
    val message: String,
) : BatchRequest(
    uri = "posts/${postId}/report",
    method = HttpMethod.POST,
    params = mapOfNotNull(
        "message" to message
    ),
)