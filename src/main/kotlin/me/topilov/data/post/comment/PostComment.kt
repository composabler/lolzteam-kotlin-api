package me.topilov.data.post.comment

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class PostComment(
    @JsonProperty("post_comment_id") val id: Int = -1,
    @JsonProperty("post_id") val postId: Int = -1,
    @JsonProperty("poster_user_id") val userId: Int = -1,
    @JsonProperty("poster_username") val username: String = "null",
    @JsonProperty("post_comment_body") val body: String = "null",
    @JsonProperty("post_comment_body_html") val bodyHtml: String = "null",
    @JsonProperty("post_comment_body_plain_text") val bodyPlainText: String = "null",
    @JsonProperty("post_comment_like_count") val likes: Int = -1,
    @JsonProperty("user_is_ignored") val userIsIgnored: Boolean = false,
    @JsonProperty("post_comment_is_published") val isPublished: Boolean = false,
    @JsonProperty("post_comment_is_deleted") val isDeleted: Boolean = false,
    @JsonProperty("post_comment_update_date") val updateDate: Long = -1,
    @JsonProperty("links") val links: PostCommentLinks = PostCommentLinks(),
    @JsonProperty("permissions") val permissions: PostCommentPermissions = PostCommentPermissions(),
)
