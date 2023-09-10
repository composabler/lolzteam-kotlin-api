package me.topilov.data.thread.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo

data class BumpThreadResponse(
    @JsonProperty("status") val status: String,
    @JsonProperty("message") val message: String,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
