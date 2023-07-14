package me.topilov.data.notification.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

class GetNotificationsRequest : BatchRequest(
    uri = "notifications",
    method = HttpMethod.GET,
)