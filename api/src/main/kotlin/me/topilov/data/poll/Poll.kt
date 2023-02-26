package me.topilov.data.poll

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Poll(
    @JsonProperty("poll_id") val id: Int = -1,
    @JsonProperty("poll_question") val question: String = "null",
    @JsonProperty("poll_vote_count") val votes: Int = -1,
    @JsonProperty("poll_max_votes") val maxVotes: Int = -1,
    @JsonProperty("poll_is_open") val isOpen: Boolean = false,
    @JsonProperty("poll_is_voted") val isVoted: Boolean = false,
    @JsonProperty("responses") val responses: List<PollResponse> = emptyList(),
    @JsonProperty("permissions") val permissions: PollPermissions = PollPermissions(),
    @JsonProperty("links") val links: PollLinks = PollLinks(),
)
