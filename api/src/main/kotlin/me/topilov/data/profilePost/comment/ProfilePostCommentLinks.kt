package me.topilov.data.profilePost.comment

import com.fasterxml.jackson.annotation.JsonProperty

data class ProfilePostCommentLinks(
    @JsonProperty("detail") val detail: String,
    @JsonProperty("profile_post") val profilePost: String,
    @JsonProperty("timeline") val timeline: String,
    @JsonProperty("timeline_user") val timelineUser: String,
    @JsonProperty("poster") val poster: String,
    @JsonProperty("poster_avatar") val posterAvatar: String,
)