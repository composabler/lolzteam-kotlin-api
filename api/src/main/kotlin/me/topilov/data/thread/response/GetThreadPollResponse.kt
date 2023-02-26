package me.topilov.data.thread.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.poll.Poll

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetThreadPollResponse(
    @JsonProperty("poll") val poll: Poll? = null,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
