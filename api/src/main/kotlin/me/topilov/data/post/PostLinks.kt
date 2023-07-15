package me.topilov.data.post

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class PostLinks(
    @JsonProperty("permalink") val permalink: String,
    @JsonProperty("detail") val detail: String,
    @JsonProperty("thread") val thread: String,
    @JsonProperty("poster") val poster: String,
    @JsonProperty("likes") val likes: String,
    @JsonProperty("report") val report: String,
    @JsonProperty("attachments") val attachments: String,
    @JsonProperty("poster_avatar") val posterAvatar: String,
)
