package me.topilov.data.search.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class SearchTaggedBatchRequest(
    val tag: String? = null,
    val tags: List<String>? = null,
    val page: Int? = null,
    val limit: Int? = null,
) : BatchRequest(
    uri = "search/tagged",
    method = HttpMethod.POST,
)
