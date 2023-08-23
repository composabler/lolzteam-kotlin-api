package me.topilov.data.user.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.user.UserGroup

data class UserGroupsResponse(
    @JsonProperty("user_groups") val groups: List<UserGroup> = emptyList(),
    @JsonProperty("user_id") val userId: Int,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
