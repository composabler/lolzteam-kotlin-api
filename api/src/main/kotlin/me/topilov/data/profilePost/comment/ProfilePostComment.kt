package me.topilov.data.profilePost.comment

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class ProfilePostComment(
    @JsonProperty("comment_id") val id: Int = -1,
    @JsonProperty("profile_post_id") val profilePostId: Int = -1,
    @JsonProperty("comment_user_id") val userId: Int = -1,
    @JsonProperty("comment_username") val username: String = "null",
    @JsonProperty("comment_create_date") val createDate: Long = -1,
    @JsonProperty("comment_body") val body: String = "null",
    @JsonProperty("user_is_ignored") val userIsIgnored: Boolean = false,
    @JsonProperty("timeline_user_id") val timelineUserId: Int,
    @JsonProperty("links") val links: ProfilePostCommentLinks = ProfilePostCommentLinks(),
    @JsonProperty("permissions") val permissions: ProfilePostCommentPermissions = ProfilePostCommentPermissions(),
)
