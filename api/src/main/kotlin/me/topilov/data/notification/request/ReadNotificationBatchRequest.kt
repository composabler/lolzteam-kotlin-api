package me.topilov.data.notification.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class ReadNotificationBatchRequest(
    override val id: String,
    val notificationId: Int? = null
) : BatchRequest(
    uri = "notifications/read",
    method = HttpMethod.POST,
    params = mapOfNotNull(
        "notification_id" to notificationId
    )
)