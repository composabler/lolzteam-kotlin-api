package me.topilov.data.profilePost

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class ProfilePostLinks(
    @JsonProperty("permalink") val permalink: String? = null,
    @JsonProperty("detail") val detail: String? = null,
    @JsonProperty("timeline") val timeline: String? = null,
    @JsonProperty("timeline_user") val timelineUser: String? = null,
    @JsonProperty("poster") val poster: String? = null,
    @JsonProperty("likes") val likes: String? = null,
    @JsonProperty("comments") val comments: String? = null,
    @JsonProperty("report") val report: String? = null,
    @JsonProperty("poster_avatar") val posterAvatar: String? = null,
)
