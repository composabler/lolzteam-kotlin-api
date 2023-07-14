package me.topilov.data.tag.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetTagsRequest(
    val page: Int? = null,
    val limit: Int? = null,
) : BatchRequest(
    uri = "tags/list",
    method = HttpMethod.GET,
    params = mapOfNotNull(
        "page" to page?.toString(),
        "limit" to limit?.toString(),
    )
)