package me.topilov.data.profilePost.comment.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class CreateProfilePostCommentRequest(
    val profilePostId: Int,
    val commentBody: String,
) : BatchRequest(
    uri = "profile-posts/${profilePostId}/comments",
    method = HttpMethod.POST,
    params = mapOf(
        "comment_body" to commentBody,
    )
)