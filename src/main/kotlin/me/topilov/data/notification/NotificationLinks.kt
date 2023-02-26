package me.topilov.data.notification

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class NotificationLinks(
    @JsonProperty("content") val content: String = "null",
    @JsonProperty("creator_avatar") val creatorAvatar: String = "null",
)
