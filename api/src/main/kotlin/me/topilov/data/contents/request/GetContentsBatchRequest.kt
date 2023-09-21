package me.topilov.data.contents.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest

data class GetContentsBatchRequest(
    val userId: Int,
    val page: Int? = null,
    val limit: Int? = null,
) : BatchRequest(
    uri = "users/$userId/timeline",
    params = mapOfNotNull(
        "page" to page,
        "limit" to limit,
    )
)