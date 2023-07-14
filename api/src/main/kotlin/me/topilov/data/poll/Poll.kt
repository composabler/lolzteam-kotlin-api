package me.topilov.data.poll

import com.fasterxml.jackson.annotation.JsonProperty

data class Poll(
    @JsonProperty("poll_id") val id: Int,
    @JsonProperty("poll_question") val question: String,
    @JsonProperty("poll_vote_count") val votes: Int,
    @JsonProperty("poll_max_votes") val maxVotes: Int,
    @JsonProperty("poll_is_open") val isOpen: Boolean,
    @JsonProperty("poll_is_voted") val isVoted: Boolean,
    @JsonProperty("responses") val responses: List<PollResponse> = emptyList(),
    @JsonProperty("permissions") val permissions: PollPermissions,
    @JsonProperty("links") val links: PollLinks,
)
