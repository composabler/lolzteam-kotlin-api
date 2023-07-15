package me.topilov.data.user.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.user.FollowingUser

data class GetUserFollowersResponse(
    @JsonProperty("users") val users: List<FollowingUser> = emptyList(),
    @JsonProperty("users_total") val total: Int,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)

