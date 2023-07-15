package me.topilov.data

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Choice(
    @JsonProperty("key") val key: String = "null",
    @JsonProperty("value") val value: String = "null",
)
