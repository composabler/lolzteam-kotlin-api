package me.topilov.data.post

import com.fasterxml.jackson.annotation.JsonProperty

data class RawPost(
    @JsonProperty("thread_id") val threadId: Int,
    @JsonProperty("post_id") val postId: Int,
)
