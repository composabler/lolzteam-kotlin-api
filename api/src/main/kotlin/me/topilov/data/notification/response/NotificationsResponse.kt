package me.topilov.data.notification.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.notification.Notification
import me.topilov.data.notification.NotificationsLinks

data class NotificationsResponse(
    @JsonProperty("notifications") val notifications: List<Notification> = emptyList(),
    @JsonProperty("notifications_total") val total: Int,
    @JsonProperty("links") val links: NotificationsLinks,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
