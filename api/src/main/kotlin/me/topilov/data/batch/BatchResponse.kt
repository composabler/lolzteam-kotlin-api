package me.topilov.data.batch

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo

@JsonIgnoreProperties(ignoreUnknown = true)
data class BatchResponse(
    @JsonProperty("jobs") val jobs: Map<String, BatchResponseJob> = emptyMap(),
    @JsonProperty("system_info") val systemInfo: SystemInfo = SystemInfo(),
)
