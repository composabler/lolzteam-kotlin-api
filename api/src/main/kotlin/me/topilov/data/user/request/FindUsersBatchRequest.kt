package me.topilov.data.user.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class FindUsersBatchRequest(
    override val id: String,
    val username: String? = null,
    val userEmail: String? = null,
    val customFields: String? = null
) : BatchRequest(
    uri = "users/find",
    method = HttpMethod.GET,
    params = mapOfNotNull(
        "username" to username,
        "user_email" to userEmail,
        "custom_fields" to customFields
    )
)