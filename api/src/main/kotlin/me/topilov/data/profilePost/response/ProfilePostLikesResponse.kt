package me.topilov.data.profilePost.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.user.RawUser

data class ProfilePostLikesResponse(
    @JsonProperty("users") val users: List<RawUser> = emptyList(),
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)

