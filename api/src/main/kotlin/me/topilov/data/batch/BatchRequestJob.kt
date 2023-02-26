package me.topilov.data.batch

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class BatchRequestJob(
    @JsonProperty("id") val id: String? = null,
    @JsonProperty("uri") val uri: String? = null,
    @JsonProperty("method") val method: String? = null,
    @JsonProperty("params") val params: Map<String, Any>? = null
)
