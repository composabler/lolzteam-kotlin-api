package me.topilov.data.user.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetUserFieldsBatchRequest(
    override val id: String,
) : BatchRequest(
    uri = "users/fields",
    method = HttpMethod.GET,
)