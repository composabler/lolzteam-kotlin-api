package me.topilov.data.user.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.user.RawUserGroup

data class AllGroupsResponse(
    @JsonProperty("user_groups") val groups: List<RawUserGroup> = emptyList(),
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
