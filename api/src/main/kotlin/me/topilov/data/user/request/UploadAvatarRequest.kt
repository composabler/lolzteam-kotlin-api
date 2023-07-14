package me.topilov.data.user.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class UploadAvatarRequest(
    val userId: Int,
    val avatar: String
) : BatchRequest(
    uri = "users/${userId}/avatar",
    method = HttpMethod.POST,
    params = mapOfNotNull(
        "avatar" to avatar
    )
)