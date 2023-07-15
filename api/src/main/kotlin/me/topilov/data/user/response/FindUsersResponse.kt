package me.topilov.data.user.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.user.User

data class FindUsersResponse(
    @JsonProperty("users") val users: List<User> = emptyList(),
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
