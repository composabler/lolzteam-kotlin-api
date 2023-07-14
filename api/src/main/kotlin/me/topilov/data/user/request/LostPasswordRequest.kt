package me.topilov.data.user.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class LostPasswordRequest(
    val oauthToken: String,
    val username: String? = null,
    val email: String? = null
) : BatchRequest(
    uri = "lost-password",
    method = HttpMethod.POST,
    params = mapOfNotNull(
        "oauth_token" to oauthToken,
        "username" to username,
        "email" to email
    )
)