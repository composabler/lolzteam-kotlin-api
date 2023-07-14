package me.topilov.data.thread.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class DeleteThreadRequest(
    val threadId: Int,
    val reason: String? = null,
) : BatchRequest(
    uri = "threads/$threadId",
    method = HttpMethod.DELETE,
    params = mapOfNotNull(
        "reason" to reason,
    )
)