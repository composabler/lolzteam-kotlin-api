package me.topilov.data.thread.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.thread.Thread

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetThreadResponse(
    @JsonProperty("thread") val thread: Thread? = null,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
