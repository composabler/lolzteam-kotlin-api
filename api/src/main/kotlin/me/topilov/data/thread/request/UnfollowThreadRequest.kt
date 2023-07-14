package me.topilov.data.thread.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class UnfollowThreadRequest(
    val threadId: Int,
) : BatchRequest(
    uri = "threads/${threadId}/followers",
    method = HttpMethod.DELETE,
)