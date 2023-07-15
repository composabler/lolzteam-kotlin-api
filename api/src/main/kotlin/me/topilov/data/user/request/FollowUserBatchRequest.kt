package me.topilov.data.user.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class FollowUserBatchRequest(
    val userId: Int,
) : BatchRequest(
    uri = "users/${userId}/followers",
    method = HttpMethod.POST,
)