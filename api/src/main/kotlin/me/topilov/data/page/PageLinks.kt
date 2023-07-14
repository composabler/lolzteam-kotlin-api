package me.topilov.data.page

import com.fasterxml.jackson.annotation.JsonProperty

data class PageLinks(
    @JsonProperty("permalink") val permalink: String,
    @JsonProperty("detail") val detail: String,
    @JsonProperty("sub-pages") val subPages: String,
)
