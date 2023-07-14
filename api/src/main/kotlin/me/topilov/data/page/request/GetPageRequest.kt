package me.topilov.data.page.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetPageRequest(
    val pageId: Int
) : BatchRequest(
    uri = "pages/$pageId",
    method = HttpMethod.GET,
)