package me.topilov.data.profilePost.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class CreateProfilePostBatchRequest(
    override val id: String,
    val userId: Int,
    val postBody: String,
    val status: String? = null,
) : BatchRequest(
    uri = "users/${userId}/timeline",
    method = HttpMethod.POST,
    params = mapOfNotNull(
        "post_body" to postBody,
        "status" to status,
    )
)
