package me.topilov.data.thread

import com.fasterxml.jackson.annotation.JsonProperty

data class RawThread(
    @JsonProperty("thread_id") val id: Int,
)
