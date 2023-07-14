package me.topilov.data

import com.fasterxml.jackson.annotation.JsonProperty

data class Result(
    @JsonProperty("status") val status: String,
    @JsonProperty("message") val message: String,
    @JsonProperty("errors") val errors: List<String> = emptyList(),
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)