package me.topilov.data.poll

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class PollLinks(
    @JsonProperty("vote") val vote: String,
)
