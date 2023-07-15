package me.topilov.data.thread

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class ThreadFollow(
    @JsonProperty("alert") val alert: Boolean = false,
    @JsonProperty("email") val email: Boolean = false,
)
