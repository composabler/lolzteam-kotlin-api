package me.topilov.data.notification

import com.fasterxml.jackson.annotation.JsonProperty

data class Notification(
    @JsonProperty("notification_id") val id: Int,
    @JsonProperty("notification_create_date") val createDate: Long,
    @JsonProperty("content_type") val contentType: String,
    @JsonProperty("content_id") val contentId: String,
    @JsonProperty("content_action") val contentAction: String,
    @JsonProperty("notification_is_unread") val isUnread: Boolean,
    @JsonProperty("creator_user_id") val creatorUserId: Int,
    @JsonProperty("creator_username") val creatorUsername: String,
    @JsonProperty("notification_type") val notificationType: String,
    @JsonProperty("links") val links: NotificationLinks,
)
