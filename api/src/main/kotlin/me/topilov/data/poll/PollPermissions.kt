package me.topilov.data.poll

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class PollPermissions(
    @JsonProperty("vote") val vote: Boolean = false,
    @JsonProperty("result") val result: Boolean = false,
)
