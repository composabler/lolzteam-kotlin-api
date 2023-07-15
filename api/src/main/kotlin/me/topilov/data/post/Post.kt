package me.topilov.data.post

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.post.comment.PostLikeUser

data class Post(
    @JsonProperty("post_id") val id: Int,
    @JsonProperty("thread_id") val threadId: Int,
    @JsonProperty("poster_user_id") val userId: Int,
    @JsonProperty("poster_username") val username: String,
    @JsonProperty("post_create_date") val createDate: Long,
    @JsonProperty("post_body") val body: String,
    @JsonProperty("post_body_html") val bodyHtml: String,
    @JsonProperty("post_body_plain_text") val bodyPlainText: String,
    @JsonProperty("signature") val signature: String,
    @JsonProperty("signature_html") val signatureHtml: String,
    @JsonProperty("signature_plain_text") val signaturePlainText: String,
    @JsonProperty("post_like_count") val likes: Int,
    @JsonProperty("post_attachment_count") val attachments: Int,
    @JsonProperty("like_users") val likeUsers: List<PostLikeUser> = emptyList(),
    @JsonProperty("user_is_ignored") val userIsIgnored: Boolean,
    @JsonProperty("post_is_published") val isPublished: Boolean,
    @JsonProperty("post_is_deleted") val isDeleted: Boolean,
    @JsonProperty("post_update_date") val updateDate: Long,
    @JsonProperty("post_is_first_post") val isFirstPost: Boolean,
    @JsonProperty("links") val links: PostLinks,
    @JsonProperty("permissions") val permissions: PostPermissions,
)
