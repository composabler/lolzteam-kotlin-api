package me.topilov.data.forum.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetForumsRequest(
    val parentCategoryId: Int? = null,
    val parentForumId: Int? = null,
    val order: String? = null,
) : BatchRequest(
    uri = "forums",
    method = HttpMethod.GET,
    params = mapOfNotNull(
        "parent_category_id" to parentCategoryId,
        "parent_forum_id" to parentForumId,
        "order" to order,
    )
)
