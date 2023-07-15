package me.topilov.data.user.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.user.UserGroup

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetUserGroupsResponse(
    @JsonProperty("user_groups") val groups: List<UserGroup> = emptyList(),
    @JsonProperty("user_id") val userId: Int = -1,
    @JsonProperty("system_info") val systemInfo: SystemInfo = SystemInfo(),
)
