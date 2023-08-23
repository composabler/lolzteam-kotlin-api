package me.topilov.data.post.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.post.Post
import me.topilov.data.thread.Thread

data class PostsResponse(
    @JsonProperty("posts") val posts: List<Post> = emptyList(),
    @JsonProperty("thread") val thread: Thread?,
    @JsonProperty("posts_total") val total: Int,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
