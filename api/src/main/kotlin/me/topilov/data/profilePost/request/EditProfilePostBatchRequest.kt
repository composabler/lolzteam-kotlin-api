package me.topilov.data.profilePost.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class EditProfilePostBatchRequest(
    val profilePostId: Int,
    val postBody: String? = null
) : BatchRequest(
    uri = "profile-posts/${profilePostId}",
    method = HttpMethod.PUT,
    params = mapOfNotNull(
        "post_body" to postBody
    )
)
