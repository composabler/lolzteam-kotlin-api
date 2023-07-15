package me.topilov.data.user.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.user.User

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetUserResponse(
    @JsonProperty("user") val user: User? = null,
    @JsonProperty("system_info") val systemInfo: SystemInfo = SystemInfo(),
)
