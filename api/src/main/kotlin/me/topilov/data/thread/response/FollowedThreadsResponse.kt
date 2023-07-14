package me.topilov.data.thread.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.thread.Thread
import me.topilov.data.thread.ThreadsLinks

data class FollowedThreadsResponse(
    @JsonProperty("threads") val threads: List<Thread> = emptyList(),
    @JsonProperty("threads_total") val total: Int,
    @JsonProperty("links") val links: ThreadsLinks,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
