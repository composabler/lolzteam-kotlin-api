package me.topilov.data.forum.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.forum.ForumFollower

data class GetForumFollowersResponse(
    @JsonProperty("users") val users: List<ForumFollower> = emptyList(),
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
