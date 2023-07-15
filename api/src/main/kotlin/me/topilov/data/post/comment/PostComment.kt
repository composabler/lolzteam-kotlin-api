package me.topilov.data.post.comment

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class PostComment(
    @JsonProperty("post_comment_id") val id: Int,
    @JsonProperty("post_id") val postId: Int,
    @JsonProperty("poster_user_id") val userId: Int,
    @JsonProperty("poster_username") val username: String,
    @JsonProperty("post_comment_body") val body: String,
    @JsonProperty("post_comment_body_html") val bodyHtml: String,
    @JsonProperty("post_comment_body_plain_text") val bodyPlainText: String,
    @JsonProperty("post_comment_like_count") val likes: Int,
    @JsonProperty("user_is_ignored") val userIsIgnored: Boolean,
    @JsonProperty("post_comment_is_published") val isPublished: Boolean,
    @JsonProperty("post_comment_is_deleted") val isDeleted: Boolean,
    @JsonProperty("post_comment_update_date") val updateDate: Long,
    @JsonProperty("links") val links: PostCommentLinks,
    @JsonProperty("permissions") val permissions: PostCommentPermissions,
)
