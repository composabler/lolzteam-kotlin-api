package me.topilov.data.profilePost

import com.fasterxml.jackson.annotation.JsonProperty

data class ProfilePostLinks(
    @JsonProperty("permalink") val permalink: String?,
    @JsonProperty("detail") val detail: String?,
    @JsonProperty("timeline") val timeline: String?,
    @JsonProperty("timeline_user") val timelineUser: String?,
    @JsonProperty("poster") val poster: String?,
    @JsonProperty("likes") val likes: String?,
    @JsonProperty("comments") val comments: String?,
    @JsonProperty("report") val report: String?,
    @JsonProperty("poster_avatar") val posterAvatar: String?,
)
