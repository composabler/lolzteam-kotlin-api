package me.topilov.data.batch

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class BatchRequest(
    @JsonProperty("jobs") val jobs: Map<String, BatchRequestJob>,
)
