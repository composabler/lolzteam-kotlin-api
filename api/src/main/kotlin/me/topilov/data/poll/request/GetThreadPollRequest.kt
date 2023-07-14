package me.topilov.data.poll.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetThreadPollRequest(
    val threadId: Int,
) : BatchRequest(
    uri = "threads/$threadId/poll",
    method = HttpMethod.GET,
)