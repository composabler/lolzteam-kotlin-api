package me.topilov.data.poll

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class PollResponse(
    @JsonProperty("response_id") val id: Int,
    @JsonProperty("response_answer") val answer: String,
    @JsonProperty("response_is_voted") val isVoted: Boolean,
    @JsonProperty("response_vote_count") val votes: Int,
)
