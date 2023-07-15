package me.topilov.data.thread.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.thread.RawThread
import me.topilov.data.thread.Thread

data class GetUnreadThreadsResponse(
    @JsonProperty("threads") val rawThreads: List<RawThread> = emptyList(),
    @JsonProperty("me/topilov/dataopilov/data") val threads: List<Thread> = emptyList(),
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
