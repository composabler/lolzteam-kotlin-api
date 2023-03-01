package me.topilov.data.forum.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetFollowedForumsBatchRequest(
    override val id: String,
    val total: Boolean? = null,
) : BatchRequest(
    uri = "forums/followed",
    method = HttpMethod.GET,
    params = mapOfNotNull(
        "total" to total?.toString(),
    )
)