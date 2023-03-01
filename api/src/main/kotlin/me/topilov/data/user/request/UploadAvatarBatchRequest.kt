package me.topilov.data.user.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class UploadAvatarBatchRequest(
    override val id: String,
    val userId: Int,
    val avatar: String
) : BatchRequest(
    uri = "users/${userId}/avatar",
    method = HttpMethod.POST,
    params = mapOfNotNull(
        "avatar" to avatar
    )
)