package me.topilov.data.forum.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetForumBatchRequest(
    override val id: String,
    val forumId: Int  = -1,
) : BatchRequest(
    uri = "forums/${forumId}/followers",
    method = HttpMethod.GET,
)
