package me.topilov.data.search

import com.fasterxml.jackson.annotation.JsonProperty

data class SearchLinks(
    @JsonProperty("pages") val pages: Int,
    @JsonProperty("page") val page: Int,
    @JsonProperty("next") val next: String,
)