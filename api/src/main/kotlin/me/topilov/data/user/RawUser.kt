package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonProperty

data class RawUser(
    @JsonProperty("user_id") val id: Int,
    @JsonProperty("username") val username: String,
)
