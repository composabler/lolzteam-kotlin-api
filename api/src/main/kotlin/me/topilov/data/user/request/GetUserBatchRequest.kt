package me.topilov.data.user.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetUserBatchRequest(
    val userId: Int,
) : BatchRequest(
    uri = "users/$userId",
    method = HttpMethod.GET,
)