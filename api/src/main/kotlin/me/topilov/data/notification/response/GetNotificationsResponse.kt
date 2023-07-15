package me.topilov.data.notification.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.notification.Notification
import me.topilov.data.notification.NotificationsLinks

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetNotificationsResponse(
    @JsonProperty("notifications") val notifications: List<Notification> = emptyList(),
    @JsonProperty("notifications_total") val total: Int = -1,
    @JsonProperty("links") val links: NotificationsLinks = NotificationsLinks(),
    @JsonProperty("system_info") val systemInfo: SystemInfo = SystemInfo(),
)
