package me.topilov.data.forum.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class UnfollowForumRequest(
    val forumId: Int,
) : BatchRequest(
    uri = "forums/${forumId}/followers",
    method = HttpMethod.DELETE,
)
