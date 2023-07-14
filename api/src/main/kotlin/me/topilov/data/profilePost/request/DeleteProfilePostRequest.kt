package me.topilov.data.profilePost.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class DeleteProfilePostRequest(
    val profilePostId: Int,
    val reason: String? = null
) : BatchRequest(
    uri = "profile-posts/${profilePostId}",
    method = HttpMethod.DELETE,
    params = mapOfNotNull(
        "reason" to reason
    )
)