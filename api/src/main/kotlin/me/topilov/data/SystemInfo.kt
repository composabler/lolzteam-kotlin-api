package me.topilov.data

import com.fasterxml.jackson.annotation.JsonProperty

data class SystemInfo(
    @JsonProperty("visitor_id") val visitorId: Int,
    @JsonProperty("time") val time: Long,
)
