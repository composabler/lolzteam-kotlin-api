package me.topilov.data.notification.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetNotificationsBatchRequest(
    override val id: String,
) : BatchRequest(
    uri = "notifications",
    method = HttpMethod.GET
)