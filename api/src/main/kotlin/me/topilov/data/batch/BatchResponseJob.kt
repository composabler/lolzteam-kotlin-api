package me.topilov.data.batch

import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import mapper

data class BatchResponseJob(
    @JsonProperty("_job_result") val result: String,
    @JsonProperty("_job_error") val error: String?,
    @JsonProperty("_job_message") val message: String?,
    val rawData: MutableMap<String, JsonNode> = mutableMapOf(),
) {
    @JsonAnySetter
    fun setUnknownField(key: String, value: JsonNode) {
        rawData[key] = value
    }
}
