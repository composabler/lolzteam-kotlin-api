package me.topilov.data.post.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetPostsBatchRequest(
    val threadId: Int? = null,
    val pageOfPostId: Int? = null,
    val postIds: String? = null,
    val page: Int? = null,
    val limit: Int? = null,
    val order: String? = null,
) : BatchRequest(
    uri = "posts",
    method = HttpMethod.GET,
    params = mapOfNotNull(
        "thread_id" to threadId,
        "page_of_post_id" to pageOfPostId,
        "post_ids" to postIds,
        "page" to page,
        "limit" to limit,
        "order" to order,
    )
)