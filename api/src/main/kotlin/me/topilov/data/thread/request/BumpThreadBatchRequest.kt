package me.topilov.data.thread.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class BumpThreadBatchRequest(
    val threadId: Int,
) : BatchRequest(
    method = HttpMethod.POST,
    uri = "threads/${threadId}/bump"
)
