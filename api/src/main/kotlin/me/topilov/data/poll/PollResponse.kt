package me.topilov.data.poll

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class PollResponse(
    @JsonProperty("response_id") val id: Int = -1,
    @JsonProperty("response_answer") val answer: String = "null",
    @JsonProperty("response_is_voted") val isVoted: Boolean = false,
    @JsonProperty("response_vote_count") val votes: Int = -1,
)
