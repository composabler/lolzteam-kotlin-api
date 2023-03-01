package me.topilov.data.profilePost.comment.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetProfilePostCommentsBatchRequest(
    val profilePostId: Int,
    val before: String? = null,
) : BatchRequest(
    uri = "profile-posts/${profilePostId}/comments",
    method = HttpMethod.GET,
    params = mapOfNotNull(
        "before" to before,
    )
)