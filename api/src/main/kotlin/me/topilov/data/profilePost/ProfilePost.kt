package me.topilov.data.profilePost

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class ProfilePost(
    @JsonProperty("profile_post_id") val id: Int = -1,
    @JsonProperty("timeline_user_id") val timelineUserId: Int = -1,
    @JsonProperty("poster_user_id") val posterUserId: Int = -1,
    @JsonProperty("poster_username") val posterUsername: String = "null",
    @JsonProperty("post_create_date") val createDate: Long = -1,
    @JsonProperty("post_body") val body: String = "null",
    @JsonProperty("post_like_count") val likes: Int = -1,
    @JsonProperty("post_comment_count") val comments: Int = -1,
    @JsonProperty("timeline_username") val timelineUsername: String = "null",
    @JsonProperty("user_is_ignored") val userIsIgnored: Boolean = false,
    @JsonProperty("post_is_published") val isPublished: Boolean = false,
    @JsonProperty("post_is_deleted") val isDeleted: Boolean = false,
    @JsonProperty("links") val links: ProfilePostLinks = ProfilePostLinks(),
    @JsonProperty("permissions") val permissions: ProfilePostPermissions = ProfilePostPermissions(),
)
