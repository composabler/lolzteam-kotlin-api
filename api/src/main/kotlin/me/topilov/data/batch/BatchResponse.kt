package me.topilov.data.batch

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class BatchResponse(
    @JsonProperty val jobs: Map<String, BatchResponseJob>
)
