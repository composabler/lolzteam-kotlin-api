package me.topilov.data.post.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class DeletePostAttachmentBatchRequest(
    val postId: String,
    val attachmentId: String,
    val threadId: String? = null,
    val attachmentHash: String? = null
) : BatchRequest(
    uri = "posts/${postId}/attachments/${attachmentId}",
    method = HttpMethod.DELETE,
    params = mapOfNotNull(
        "thread_id" to threadId,
        "attachment_hash" to attachmentHash
    )
)