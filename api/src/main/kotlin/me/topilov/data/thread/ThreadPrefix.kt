package me.topilov.data.thread

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class ThreadPrefix(
    @JsonProperty("prefix_id") val id: Int = -1,
    @JsonProperty("prefix_title") val title: String = "null",
)
