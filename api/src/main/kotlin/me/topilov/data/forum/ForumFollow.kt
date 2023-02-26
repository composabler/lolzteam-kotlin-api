package me.topilov.data.forum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class ForumFollow(
    @JsonProperty("post") val post: Boolean = false,
    @JsonProperty("alert") val alert: Boolean = false,
    @JsonProperty("email") val email: Boolean = false,
)
