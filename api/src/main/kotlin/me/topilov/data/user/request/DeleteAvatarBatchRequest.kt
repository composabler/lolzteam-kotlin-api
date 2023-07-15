package me.topilov.data.user.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class DeleteAvatarBatchRequest(
    val userId: Int
) : BatchRequest(
    uri = "users/${userId}/avatar",
    method = HttpMethod.DELETE
)