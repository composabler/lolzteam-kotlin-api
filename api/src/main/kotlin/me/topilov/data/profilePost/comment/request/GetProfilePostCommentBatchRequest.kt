package me.topilov.data.profilePost.comment.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetProfilePostCommentBatchRequest(
    val profilePostId: Int,
    val commentId: Int,
) : BatchRequest(
    uri = "profile-posts/${profilePostId}/comments/${commentId}",
    method = HttpMethod.GET,
)