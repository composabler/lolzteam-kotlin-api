package me.topilov.data.thread

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class ThreadFollower(
    @JsonProperty("user_id") val userId: Int = -1,
    @JsonProperty("username") val username: String = "null",
    @JsonProperty("follow") val follow: ThreadFollow = ThreadFollow(),
)
