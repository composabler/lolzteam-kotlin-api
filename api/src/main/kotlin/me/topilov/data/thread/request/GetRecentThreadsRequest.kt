package me.topilov.data.thread.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetRecentThreadsRequest(
    val days: Int? = null,
    val limit: Int? = null,
    val forumId: Int? = null,
    val dataLimit: Int? = null,
) : BatchRequest(
    uri = "threads/recent",
    method = HttpMethod.GET,
    params = mapOfNotNull(
        "days" to days,
        "limit" to limit,
        "forum_id" to forumId,
        "data_limit" to dataLimit,
    )
)