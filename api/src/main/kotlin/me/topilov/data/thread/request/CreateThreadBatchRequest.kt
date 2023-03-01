package me.topilov.data.thread.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class CreateThreadBatchRequest(
    override val id: String,
    val forumId: Int,
    val threadTitle: String,
    val postBody: String,
    val threadPrefixId: Int? = null,
    val threadTags: String? = null
) : BatchRequest(
    uri = "threads",
    method = HttpMethod.POST,
    params = mapOfNotNull(
        "forum_id" to forumId,
        "thread_title" to threadTitle,
        "post_body" to postBody,
        "thread_prefix_id" to threadPrefixId,
        "thread_tags" to threadTags
    )
)