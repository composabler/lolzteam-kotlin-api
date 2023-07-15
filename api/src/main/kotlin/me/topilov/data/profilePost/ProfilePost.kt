package me.topilov.data.profilePost

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class ProfilePost(
    @JsonProperty("profile_post_id") val id: Int,
    @JsonProperty("timeline_user_id") val timelineUserId: Int,
    @JsonProperty("poster_user_id") val posterUserId: Int,
    @JsonProperty("poster_username") val posterUsername: String,
    @JsonProperty("post_create_date") val createDate: Long,
    @JsonProperty("post_body") val body: String,
    @JsonProperty("post_like_count") val likes: Int,
    @JsonProperty("post_comment_count") val comments: Int,
    @JsonProperty("timeline_username") val timelineUsername: String,
    @JsonProperty("user_is_ignored") val userIsIgnored: Boolean,
    @JsonProperty("post_is_published") val isPublished: Boolean,
    @JsonProperty("post_is_deleted") val isDeleted: Boolean,
    @JsonProperty("links") val links: ProfilePostLinks,
    @JsonProperty("permissions") val permissions: ProfilePostPermissions,
)
