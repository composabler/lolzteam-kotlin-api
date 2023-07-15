package me.topilov.data.user.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetUserGroupsBatchRequest(
    val userId: Int,
) : BatchRequest(
    uri = "users/${userId}/groups",
    method = HttpMethod.GET,
)