package me.topilov.data.thread

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class ThreadLinks(
    @JsonProperty("permalink") val permalink: String = "null",
    @JsonProperty("detail") val detail: String = "null",
    @JsonProperty("followers") val followers: String = "null",
    @JsonProperty("forum") val forum: String = "null",
    @JsonProperty("posts") val posts: String = "null",
    @JsonProperty("first_poster") val firstPoster: String = "null",
    @JsonProperty("first_poster_avatar") val firstPosterAvatar: String = "null",
    @JsonProperty("first_post") val firstPost: String = "null",
    @JsonProperty("last_poster") val lastPoster: String = "null",
    @JsonProperty("last_post") val lastPost: String = "null",
)
