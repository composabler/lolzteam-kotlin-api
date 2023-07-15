package me.topilov.data.post.comment

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class RawPostComment(
    @JsonProperty("post_comment_id") val id: Int = -1,
    @JsonProperty("post_id") val postId: Int = -1,
    @JsonProperty("user_id") val userId: Int = -1,
    @JsonProperty("username") val username: String = "null",
    @JsonProperty("id_id") val ipId: Int = -1,
    @JsonProperty("warning_id") val warningId: Int = -1,
    @JsonProperty("warning_message") val warningMessage: String = "null",
    @JsonProperty("message") val message: String = "null",
    @JsonProperty("message_state") val messageState: String = "null",
    @JsonProperty("comment_date") val commentDate: Int = -1,
    @JsonProperty("comment_date_ms") val commentDateMs: Long = -1,
    @JsonProperty("last_edit_date") val lastEditDate: Int = -1,
    @JsonProperty("last_edit_user_id") val lastEditUserId: Int = -1,
    @JsonProperty("likes") val likes: Int = -1,
)
