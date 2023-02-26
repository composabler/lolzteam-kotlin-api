package me.topilov.data.post

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.post.comment.PostLikeUser

@JsonIgnoreProperties(ignoreUnknown = true)
data class Post(
    @JsonProperty("post_id") val id: Int = -1,
    @JsonProperty("thread_id") val threadId: Int = -1,
    @JsonProperty("poster_user_id") val userId: Int = -1,
    @JsonProperty("poster_username") val username: String = "null",
    @JsonProperty("post_create_date") val createDate: Long = -1,
    @JsonProperty("post_body") val body: String = "null",
    @JsonProperty("post_body_html") val bodyHtml: String = "null",
    @JsonProperty("post_body_plain_text") val bodyPlainText: String = "null",
    @JsonProperty("signature") val signature: String = "null",
    @JsonProperty("signature_html") val signatureHtml: String = "null",
    @JsonProperty("signature_plain_text") val signaturePlainText: String = "null",
    @JsonProperty("post_like_count") val likes: Int = -1,
    @JsonProperty("post_attachment_count") val attachments: Int = -1,
    @JsonProperty("like_users") val likeUsers: List<PostLikeUser> = emptyList(),
    @JsonProperty("user_is_ignored") val userIsIgnored: Boolean = false,
    @JsonProperty("post_is_published") val isPublished: Boolean = false,
    @JsonProperty("post_is_deleted") val isDeleted: Boolean = false,
    @JsonProperty("post_update_date") val updateDate: Long = -1,
    @JsonProperty("post_is_first_post") val isFirstPost: Boolean = false,
    @JsonProperty("links") val links: PostLinks = PostLinks(),
    @JsonProperty("permissions") val permissions: PostPermissions = PostPermissions(),
)
