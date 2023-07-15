package me.topilov.data.tag

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class CustomMarketTag(
    @JsonProperty("title") val title: String,
    @JsonProperty("bc") val bc: String,
)
