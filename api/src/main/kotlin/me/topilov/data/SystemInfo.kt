package me.topilov.data

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class SystemInfo(
    @JsonProperty("visitor_id") val visitorId: Int = -1,
    @JsonProperty("time") val time: Long = -1,
)
