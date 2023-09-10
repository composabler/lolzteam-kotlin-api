package me.topilov.data.search.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class SearchPostsBatchRequest(
    val query: String? = null,
    val tag: String? = null,
    val forumId: Int? = null,
    val userId: Int? = null,
    val pagePostId: Int? = null,
    val limit: Int? = null,
    val dataLimit: Int? = null,
) : BatchRequest(
    uri = "search/posts",
    method = HttpMethod.POST,
)
