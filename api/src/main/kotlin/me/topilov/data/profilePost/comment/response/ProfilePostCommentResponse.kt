package me.topilov.data.profilePost.comment.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.profilePost.comment.ProfilePostComment

data class ProfilePostCommentResponse(
    @JsonProperty("comment") val comment: ProfilePostComment?,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
