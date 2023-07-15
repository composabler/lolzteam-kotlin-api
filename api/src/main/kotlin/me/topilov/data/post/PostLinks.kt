package me.topilov.data.post

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class PostLinks(
    @JsonProperty("permalink") val permalink: String = "null",
    @JsonProperty("detail") val detail: String = "null",
    @JsonProperty("thread") val thread: String = "null",
    @JsonProperty("poster") val poster: String = "null",
    @JsonProperty("likes") val likes: String = "null",
    @JsonProperty("report") val report: String = "null",
    @JsonProperty("attachments") val attachments: String = "null",
    @JsonProperty("poster_avatar") val posterAvatar: String = "null",
)
