package me.topilov.data.post.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class CreatePostBatchRequest(
    val threadId: Int,
    val postBody: String? = null,
    val quotePostId: Int? = null,
) : BatchRequest(
    uri = "posts",
    method = HttpMethod.POST,
    params = mapOfNotNull(
        "thread_id" to threadId,
        "post_body" to postBody,
        "quote_post_id" to quotePostId,
    )
)