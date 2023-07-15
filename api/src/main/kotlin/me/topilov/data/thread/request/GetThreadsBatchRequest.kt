package me.topilov.data.thread.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetThreadsBatchRequest(
    val forumId: Int? = null,
    val threadIds: String? = null,
    val creatorUserId: Int? = null,
    val sticky: Int? = null,
    val threadPrefixId: Int? = null,
    val threadTagId: Int? = null,
    val page: Int? = null,
    val limit: Int? = null,
    val order: String? = null,
    val threadCreateDate: String? = null,
    val threadUpdateDate: String? = null,
) : BatchRequest(
    uri = "threads",
    method = HttpMethod.GET,
    params = mapOfNotNull(
        "forum_id" to forumId,
        "thread_ids" to threadIds,
        "creator_user_id" to creatorUserId,
        "sticky" to sticky,
        "thread_prefix_id" to threadPrefixId,
        "thread_tag_id" to threadTagId,
        "page" to page,
        "limit" to limit,
        "order" to order,
        "thread_create_date" to threadCreateDate,
        "thread_update_date" to threadUpdateDate,
    )
)