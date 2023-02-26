package me.topilov.data.page

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class PageLinks(
    @JsonProperty("permalink") val permalink: String = "null",
    @JsonProperty("detail") val detail: String = "null",
    @JsonProperty("sub-pages") val subPages: String = "null",
)
