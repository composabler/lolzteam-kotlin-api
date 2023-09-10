package me.topilov.data.user.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.user.User

data class CreateUserResponse(
    @JsonProperty("user") val user: User,
    @JsonProperty("token") val token: String,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
