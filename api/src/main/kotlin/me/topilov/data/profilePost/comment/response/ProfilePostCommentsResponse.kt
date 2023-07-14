package me.topilov.data.profilePost.comment.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.profilePost.ProfilePost
import me.topilov.data.profilePost.comment.ProfilePostComment
import me.topilov.data.user.User

data class ProfilePostCommentsResponse(
    @JsonProperty("comments") val comments: List<ProfilePostComment> = emptyList(),
    @JsonProperty("comments_total") val total: Int,
    @JsonProperty("profile_post") val post: ProfilePost?,
    @JsonProperty("timeline_user") val timelineUser: User?,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
