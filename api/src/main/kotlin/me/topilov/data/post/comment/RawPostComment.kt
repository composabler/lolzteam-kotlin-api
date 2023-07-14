package me.topilov.data.post.comment

import com.fasterxml.jackson.annotation.JsonProperty

data class RawPostComment(
    @JsonProperty("post_comment_id") val id: Int,
    @JsonProperty("post_id") val postId: Int,
    @JsonProperty("user_id") val userId: Int,
    @JsonProperty("username") val username: String,
    @JsonProperty("id_id") val ipId: Int,
    @JsonProperty("warning_id") val warningId: Int,
    @JsonProperty("warning_message") val warningMessage: String,
    @JsonProperty("message") val message: String,
    @JsonProperty("message_state") val messageState: String,
    @JsonProperty("comment_date") val commentDate: Int,
    @JsonProperty("comment_date_ms") val commentDateMs: Long,
    @JsonProperty("last_edit_date") val lastEditDate: Int,
    @JsonProperty("last_edit_user_id") val lastEditUserId: Int,
    @JsonProperty("likes") val likes: Int,
)
