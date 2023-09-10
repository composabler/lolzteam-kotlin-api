package me.topilov.data.user.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.user.User

data class MyUserResponse(
    @JsonProperty("user") val user: User,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
