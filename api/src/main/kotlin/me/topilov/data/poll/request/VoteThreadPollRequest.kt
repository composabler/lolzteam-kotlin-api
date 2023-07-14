package me.topilov.data.poll.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class VoteThreadPollRequest(
    val threadId: Int,
    val responseId: Int,
    val responseIds: String? = null,
) : BatchRequest(
    uri = "threads/$threadId/poll/votes",
    method = HttpMethod.POST,
    params = mapOfNotNull(
        "response_id" to responseId,
        "response_ids" to responseIds,
    )
)