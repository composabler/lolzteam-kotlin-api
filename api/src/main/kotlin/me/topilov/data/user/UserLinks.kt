package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class UserLinks(
    @JsonProperty("permalink") val permalink: String = "null",
    @JsonProperty("detail") val detail: String = "null",
    @JsonProperty("avatar") val avatar: String = "null",
    @JsonProperty("avatar_big") val avatarBig: String = "null",
    @JsonProperty("avatar_small") val avatarSmall: String = "null",
    @JsonProperty("followers") val followers: String = "null",
    @JsonProperty("followings") val followings: String = "null",
    @JsonProperty("ignore") val ignore: String = "null",
    @JsonProperty("timeline") val timeline: String = "null",
)
