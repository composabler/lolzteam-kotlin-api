package me.topilov.data

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Result(
    @JsonProperty("status") val status: String = "null",
    @JsonProperty("message") val message: String = "null",
    @JsonProperty("errors") val errors: List<String> = emptyList(),
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
