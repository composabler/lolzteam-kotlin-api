package me.topilov.data.forum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class ForumFollow(
    @JsonProperty("post") val post: Boolean,
    @JsonProperty("alert") val alert: Boolean,
    @JsonProperty("email") val email: Boolean,
)
