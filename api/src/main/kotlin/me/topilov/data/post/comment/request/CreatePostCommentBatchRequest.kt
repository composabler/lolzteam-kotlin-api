package me.topilov.data.post.comment.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class CreatePostCommentBatchRequest(
    override val id: String,
    val postId: Int,
    val commentBody: String,
) : BatchRequest(
    uri = "posts/${postId}/comments",
    method = HttpMethod.POST,
    params = mapOfNotNull(
        "comment_body" to commentBody,
    )
)