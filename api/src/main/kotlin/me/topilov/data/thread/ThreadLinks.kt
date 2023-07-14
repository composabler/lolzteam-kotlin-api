package me.topilov.data.thread

import com.fasterxml.jackson.annotation.JsonProperty

data class ThreadLinks(
    @JsonProperty("permalink") val permalink: String,
    @JsonProperty("detail") val detail: String,
    @JsonProperty("followers") val followers: String,
    @JsonProperty("forum") val forum: String,
    @JsonProperty("posts") val posts: String,
    @JsonProperty("first_poster") val firstPoster: String,
    @JsonProperty("first_poster_avatar") val firstPosterAvatar: String,
    @JsonProperty("first_post") val firstPost: String,
    @JsonProperty("last_poster") val lastPoster: String,
    @JsonProperty("last_post") val lastPost: String,
)
