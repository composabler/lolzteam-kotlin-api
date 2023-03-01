package me.topilov.data.page.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetPagesBatchRequest(
    val parentPageId: Int? = null,
    val order: String? = null,
) : BatchRequest(
    uri = "pages",
    method = HttpMethod.GET,
    params = mapOfNotNull(
        "parent_page_id" to parentPageId?.toString(),
        "order" to order,
    )
)