package me.topilov.data.thread.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.thread.RawThread
import me.topilov.data.thread.Thread

data class RecentThreadsResponse(
    @JsonProperty("threads") val rawThreads: List<RawThread> = emptyList(),
    @JsonProperty("data") val threads: List<Thread> = emptyList(),
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
