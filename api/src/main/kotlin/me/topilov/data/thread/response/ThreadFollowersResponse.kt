package me.topilov.data.thread.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.thread.ThreadFollower

data class ThreadFollowersResponse(
    @JsonProperty("users") val users: List<ThreadFollower> = emptyList(),
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
