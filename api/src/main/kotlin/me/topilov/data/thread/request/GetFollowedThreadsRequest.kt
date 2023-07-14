package me.topilov.data.thread.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetFollowedThreadsRequest(
    val limit: Int? = null,
    val total: Boolean? = null
) : BatchRequest(
    uri = "threads/followed",
    method = HttpMethod.GET,
    params = mapOfNotNull(
        "limit" to limit,
        "total" to total,
    )
)