package me.topilov.data.profilePost.comment

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class ProfilePostComment(
    @JsonProperty("comment_id") val id: Int,
    @JsonProperty("profile_post_id") val profilePostId: Int,
    @JsonProperty("comment_user_id") val userId: Int,
    @JsonProperty("comment_username") val username: String,
    @JsonProperty("comment_create_date") val createDate: Long,
    @JsonProperty("comment_body") val body: String,
    @JsonProperty("user_is_ignored") val userIsIgnored: Boolean,
    @JsonProperty("timeline_user_id") val timelineUserId: Int,
    @JsonProperty("links") val links: ProfilePostCommentLinks,
    @JsonProperty("permissions") val permissions: ProfilePostCommentPermissions,
)
