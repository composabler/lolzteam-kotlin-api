package me.topilov.data.notification

import com.fasterxml.jackson.annotation.JsonProperty

data class NotificationLinks(
    @JsonProperty("content") val content: String,
    @JsonProperty("creator_avatar") val creatorAvatar: String,
)
