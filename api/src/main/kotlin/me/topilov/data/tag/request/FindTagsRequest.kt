package me.topilov.data.tag.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class FindTagsRequest(
    val tag: String
) : BatchRequest(
    uri = "tags/find",
    method = HttpMethod.GET,
    params = mapOfNotNull(
        "tag" to tag
    )
)