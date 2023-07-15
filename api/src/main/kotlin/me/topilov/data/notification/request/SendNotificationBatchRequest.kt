package me.topilov.data.notification.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class SendNotificationBatchRequest(
    val userId: Int,
    val message: String,
    val notificationType: String? = null,
    val extraData: String? = null,
) : BatchRequest(
    uri = "notifications/custom",
    method = HttpMethod.POST,
    params = mapOfNotNull(
        "user_id" to userId,
        "message" to message,
        "notification_type" to notificationType,
        "extra_data" to extraData
    )
)