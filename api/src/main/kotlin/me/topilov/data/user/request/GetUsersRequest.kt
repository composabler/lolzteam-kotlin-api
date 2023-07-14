package me.topilov.data.user.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetUsersRequest(
    val page: Int? = null,
    val limit: Int? = null,
) : BatchRequest(
    uri = "users",
    method = HttpMethod.GET,
    params = mapOfNotNull(
        "page" to page,
        "limit" to limit,
    )
)