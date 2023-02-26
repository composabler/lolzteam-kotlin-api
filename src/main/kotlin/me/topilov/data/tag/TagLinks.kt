package me.topilov.data.tag

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class TagLinks(
    @JsonProperty("permalink") val permalink: String = "null",
    @JsonProperty("detail") val detail: String = "null",
)
