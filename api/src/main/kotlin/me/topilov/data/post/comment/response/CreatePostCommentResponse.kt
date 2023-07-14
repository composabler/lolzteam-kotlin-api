package me.topilov.data.post.comment.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.post.comment.RawPostComment

data class CreatePostCommentResponse(
    @JsonProperty("comment") val comment: RawPostComment?,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
