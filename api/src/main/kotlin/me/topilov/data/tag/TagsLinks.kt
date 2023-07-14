package me.topilov.data.tag

import com.fasterxml.jackson.annotation.JsonProperty

data class TagsLinks(
    @JsonProperty("pages") val pages: Int,
    @JsonProperty("page") val page: Int,
    @JsonProperty("next") val next: String,
)
