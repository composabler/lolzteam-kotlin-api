package me.topilov.data.thread

import com.fasterxml.jackson.annotation.JsonProperty

data class ThreadFollow(
    @JsonProperty("alert") val alert: Boolean,
    @JsonProperty("email") val email: Boolean,
)
