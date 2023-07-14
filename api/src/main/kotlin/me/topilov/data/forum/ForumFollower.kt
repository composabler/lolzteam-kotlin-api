package me.topilov.data.forum

import com.fasterxml.jackson.annotation.JsonProperty

data class ForumFollower(
    @JsonProperty("user_id") val userId: Int,
    @JsonProperty("username") val username: String,
    @JsonProperty("follow") val follow: ForumFollow?,
)
