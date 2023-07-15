package me.topilov.data.post.comment

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class PostCommentLinks(
    @JsonProperty("permalink") val permalink: String,
    @JsonProperty("detail") val detail: String,
    @JsonProperty("post") val post: String,
    @JsonProperty("thread") val thread: String,
    @JsonProperty("poster") val poster: String,
    @JsonProperty("likes") val likes: String,
    @JsonProperty("report") val report: String,
    @JsonProperty("poster_avatar") val posterAvatar: String,
)
