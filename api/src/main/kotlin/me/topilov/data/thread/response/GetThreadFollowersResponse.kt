package me.topilov.data.thread.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.thread.ThreadFollower

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetThreadFollowersResponse(
    @JsonProperty("users") val users: List<ThreadFollower> = emptyList(),
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
