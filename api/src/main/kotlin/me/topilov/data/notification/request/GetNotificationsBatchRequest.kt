package me.topilov.data.notification.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod
import java.util.*

class GetNotificationsBatchRequest : BatchRequest(
    uri = "notifications",
    method = HttpMethod.GET,
)