package me.topilov.data

import com.fasterxml.jackson.annotation.JsonProperty

data class Choice(
    @JsonProperty("key") val key: String,
    @JsonProperty("value") val value: String,
)
