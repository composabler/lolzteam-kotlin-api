package me.topilov.data.thread

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class ThreadsLinks(
    @JsonProperty("pages") val pages: Int = -1,
    @JsonProperty("page") val page: Int = -1,
    @JsonProperty("next") val next: String = "null",
)
