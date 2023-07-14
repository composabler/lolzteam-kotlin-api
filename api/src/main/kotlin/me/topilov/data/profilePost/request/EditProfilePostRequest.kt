package me.topilov.data.profilePost.request

import com.fasterxml.jackson.annotation.JsonInclude
import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

@JsonInclude(JsonInclude.Include.NON_NULL)
data class EditProfilePostRequest(
    val profilePostId: Int,
    val postBody: String? = null
) : BatchRequest(
    uri = "profile-posts/${profilePostId}",
    method = HttpMethod.PUT,
    params = mapOfNotNull(
        "post_body" to postBody
    )
)
