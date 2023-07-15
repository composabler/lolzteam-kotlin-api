package me.topilov.data.poll

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class PollPermissions(
    @JsonProperty("vote") val vote: Boolean,
    @JsonProperty("result") val result: Boolean,
)
