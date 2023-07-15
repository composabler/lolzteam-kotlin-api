package me.topilov.data.post.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetPostLikesBatchRequest(
    val postId: Int,
    val page: Int? = null,
    val limit: Int? = null,
) : BatchRequest(
    uri = "posts/$postId/likes",
    method = HttpMethod.GET,
    params = mapOfNotNull(
        "page" to page,
        "limit" to limit,
    )
)