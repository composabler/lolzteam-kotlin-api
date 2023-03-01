package me.topilov.data.user.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetAllGroupsBatchRequest(
    override val id: String,
) : BatchRequest(
    uri = "users/groups",
    method = HttpMethod.GET,
)