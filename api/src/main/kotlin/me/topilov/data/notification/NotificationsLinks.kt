package me.topilov.data.notification

import com.fasterxml.jackson.annotation.JsonProperty

data class NotificationsLinks(
    @JsonProperty("read") val read: String,
    @JsonProperty("pages") val pages: Int,
    @JsonProperty("page") val page: Int,
    @JsonProperty("next") val next: String,
)
