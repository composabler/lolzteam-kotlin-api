package me.topilov.data.profilePost.comment

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class ProfilePostCommentLinks(
    @JsonProperty("detail") val detail: String = "null",
    @JsonProperty("profile_post") val profilePost: String = "null",
    @JsonProperty("timeline") val timeline: String = "null",
    @JsonProperty("timeline_user") val timelineUser: String = "null",
    @JsonProperty("poster") val poster: String = "null",
    @JsonProperty("poster_avatar") val posterAvatar: String = "null",
)