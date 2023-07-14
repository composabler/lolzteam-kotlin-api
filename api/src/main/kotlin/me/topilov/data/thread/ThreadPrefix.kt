package me.topilov.data.thread

import com.fasterxml.jackson.annotation.JsonProperty

data class ThreadPrefix(
    @JsonProperty("prefix_id") val id: Int,
    @JsonProperty("prefix_title") val title: String,
)
