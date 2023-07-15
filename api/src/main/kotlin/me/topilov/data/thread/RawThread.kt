package me.topilov.data.thread

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class RawThread(
    @JsonProperty("thread_id") val id: Int = -1,
)
