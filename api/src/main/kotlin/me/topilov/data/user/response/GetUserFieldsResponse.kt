package me.topilov.data.user.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.user.UserField
import me.topilov.data.SystemInfo

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetUserFieldsResponse(
    @JsonProperty("fields") val fields: List<UserField> = emptyList(),
    @JsonProperty("system_info") val systemInfo: SystemInfo = SystemInfo(),
)
