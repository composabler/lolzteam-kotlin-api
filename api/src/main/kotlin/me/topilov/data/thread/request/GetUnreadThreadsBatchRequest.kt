package me.topilov.data.thread.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetUnreadThreadsBatchRequest(
    val limit: Int? = null,
    val forumId: Int? = null,
    val dataLimit: Int? = null,
) : BatchRequest(
    uri = "threads/new",
    method = HttpMethod.GET,
    params = mapOfNotNull(
        "limit" to limit,
        "forum_id" to forumId,
        "data_limit" to dataLimit,
    )
)