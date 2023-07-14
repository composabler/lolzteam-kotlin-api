package me.topilov.data.forum.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.forum.ForumFollower

data class ForumFollowersResponse(
    @JsonProperty("users") val users: List<ForumFollower> = emptyList(),
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
