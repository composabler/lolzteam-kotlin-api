package me.topilov.data.category.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetCategoriesBatchRequest(
    val parentCategoryId: Int? = null,
    val parentForumId: Int? = null,
    val order: String? = null,
) : BatchRequest(
    uri = "categories",
    method = HttpMethod.GET,
)