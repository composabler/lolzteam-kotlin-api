package me.topilov.data.profilePost.comment.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.profilePost.comment.ProfilePostComment

@JsonIgnoreProperties(ignoreUnknown = true)
data class CreateProfilePostCommentResponse(
    @JsonProperty("comment") val comment: ProfilePostComment? = null,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
