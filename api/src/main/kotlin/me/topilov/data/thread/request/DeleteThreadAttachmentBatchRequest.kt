package me.topilov.data.thread.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class DeleteThreadAttachmentBatchRequest(
    val forumId: Int,
    val attachmentId: Int,
    val attachmentHash: String? = null,
) : BatchRequest(
    uri = "threads/attachments",
    method = HttpMethod.DELETE,
    params = mapOfNotNull(
        "forum_id" to forumId,
        "attachment_id" to attachmentId,
        "attachment_hash" to attachmentHash,
    )
)