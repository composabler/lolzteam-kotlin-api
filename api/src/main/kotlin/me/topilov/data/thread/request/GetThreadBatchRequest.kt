package me.topilov.data.thread.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetThreadBatchRequest(
    override val id: String,
    val threadId: Int,
) : BatchRequest(
    uri = "threads/$threadId",
    method = HttpMethod.GET,
)