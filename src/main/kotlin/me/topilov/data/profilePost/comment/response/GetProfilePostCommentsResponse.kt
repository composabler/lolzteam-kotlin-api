package me.topilov.data.profilePost.comment.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.profilePost.ProfilePost
import me.topilov.data.profilePost.comment.ProfilePostComment
import me.topilov.data.user.User

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetProfilePostCommentsResponse(
    @JsonProperty("comments") val comments: List<ProfilePostComment> = emptyList(),
    @JsonProperty("comments_total") val total: Int = -1,
    @JsonProperty("profile_post") val post: ProfilePost? = null,
    @JsonProperty("timeline_user") val timelineUser: User? = null,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
