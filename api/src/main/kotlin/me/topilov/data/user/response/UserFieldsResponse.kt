package me.topilov.data.user.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.user.UserField

data class UserFieldsResponse(
    @JsonProperty("fields") val fields: List<UserField> = emptyList(),
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
