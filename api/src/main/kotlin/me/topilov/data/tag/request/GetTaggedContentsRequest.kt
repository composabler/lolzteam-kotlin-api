package me.topilov.data.tag.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetTaggedContentsRequest(
    val tagId: Int,
    val page: Int? = null,
    val limit: Int? = null,
) : BatchRequest(
    uri = "tags/${tagId}",
    method = HttpMethod.GET,
    params = mapOfNotNull(
        "page" to page,
        "limit" to limit,
    )
)