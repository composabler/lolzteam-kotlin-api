package me.topilov.data.post.comment.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetPostCommentsBatchRequest(
    override val id: String,
    val postId: Int,
    val before: Long? = null,
) : BatchRequest(
    uri = "posts/${postId}/comments",
    method = HttpMethod.GET,
    params = mapOfNotNull(
        "before" to before,
    )
)