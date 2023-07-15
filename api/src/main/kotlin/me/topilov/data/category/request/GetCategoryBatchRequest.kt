package me.topilov.data.category.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetCategoryBatchRequest(
    val categoryId: Int,
) : BatchRequest(
    uri = "categories/${categoryId}",
    method = HttpMethod.GET,
)