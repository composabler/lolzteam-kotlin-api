package me.topilov.data.profilePost.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class ReportProfilePostBatchRequest(
    override val id: String,
    val profilePostId: Int,
    val message: String
) : BatchRequest(
    uri = "profile-posts/${profilePostId}/report",
    method = HttpMethod.POST,
    params = mapOf("message" to message)
)