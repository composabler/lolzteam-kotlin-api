package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonProperty

data class UserLinks(
    @JsonProperty("permalink") val permalink: String,
    @JsonProperty("detail") val detail: String,
    @JsonProperty("avatar") val avatar: String,
    @JsonProperty("avatar_big") val avatarBig: String,
    @JsonProperty("avatar_small") val avatarSmall: String,
    @JsonProperty("followers") val followers: String,
    @JsonProperty("followings") val followings: String,
    @JsonProperty("ignore") val ignore: String,
    @JsonProperty("timeline") val timeline: String,
)
