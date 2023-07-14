package me.topilov.data.post.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.post.Post

data class EditPostResponse(
    @JsonProperty("post") val post: Post?,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
