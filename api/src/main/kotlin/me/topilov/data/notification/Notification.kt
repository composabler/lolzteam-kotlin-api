package me.topilov.data.notification

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Notification(
    @JsonProperty("notification_id") val id: Int = -1,
    @JsonProperty("notification_create_date") val createDate: Long = -1,
    @JsonProperty("content_type") val contentType: String = "null",
    @JsonProperty("content_id") val contentId: String = "null",
    @JsonProperty("content_action") val contentAction: String = "null",
    @JsonProperty("notification_is_unread") val isUnread: Boolean = false,
    @JsonProperty("creator_user_id") val creatorUserId: Int = -1,
    @JsonProperty("creator_username") val creatorUsername: String = "null",
    @JsonProperty("notification_type") val notificationType: String = "null",
    @JsonProperty("links") val links: NotificationLinks = NotificationLinks(),
)
