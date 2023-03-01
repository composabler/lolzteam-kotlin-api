package me.topilov.data.post.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class UnlikePostBatchRequest(
    override val id: String,
    val postId: Int,
) : BatchRequest(
    uri = "posts/${postId}/likes",
    method = HttpMethod.DELETE,
)