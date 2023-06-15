package me.topilov.data.tag

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class CustomMarketTag(
    @JsonProperty("title") val title: String = "null",
    @JsonProperty("bc") val bc: String = "null",
)
