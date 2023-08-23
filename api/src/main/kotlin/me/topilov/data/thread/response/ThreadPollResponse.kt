package me.topilov.data.thread.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.poll.Poll

data class ThreadPollResponse(
    @JsonProperty("poll") val poll: Poll?,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
