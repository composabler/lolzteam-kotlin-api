package me.topilov.data.contents

import com.fasterxml.jackson.annotation.JsonProperty

data class ContentsLinks(
    @JsonProperty("pages") val pages: Int,
    @JsonProperty("page") val page: Int,
    @JsonProperty("next") val next: String? = null,
)