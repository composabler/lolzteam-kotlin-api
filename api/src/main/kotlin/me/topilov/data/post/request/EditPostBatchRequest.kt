package me.topilov.data.post.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class EditPostBatchRequest(
    override val id: String,
    val postId: Int,
    val postBody: String,
    val threadTitle: String? = null,
    val threadPrefixId: Int? = null,
    val threadTags: String? = null,
    val threadNodeId: Int? = null,
) : BatchRequest(
    uri = "posts/${postId}",
    method = HttpMethod.PUT,
    params = mapOfNotNull(
        "post_body" to postBody,
        "thread_title" to threadTitle,
        "thread_prefix_id" to threadPrefixId,
        "thread_tags" to threadTags,
        "thread_node_id" to threadNodeId,
    )
)