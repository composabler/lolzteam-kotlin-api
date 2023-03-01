package me.topilov.data.post.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class DeletePostBatchRequest(
    override val id: String,
    val postId: Int,
    val reason: String? = null,
) : BatchRequest(
    uri = "posts/${postId}",
    method = HttpMethod.DELETE,
    params = mapOfNotNull(
        "reason" to reason,
    )
)