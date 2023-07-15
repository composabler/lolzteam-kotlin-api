package me.topilov.data.notification.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class GetNotificationBatchRequest(
    val notificationId: Int
) : BatchRequest(
    uri = "notifications/${notificationId}/content",
    method = HttpMethod.GET
)