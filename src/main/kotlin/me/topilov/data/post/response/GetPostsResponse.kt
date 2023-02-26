package me.topilov.data.post.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.post.Post
import me.topilov.data.thread.Thread

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetPostsResponse(
    @JsonProperty("posts") val posts: List<Post> = emptyList(),
    @JsonProperty("thread") val thread: Thread? = null,
    @JsonProperty("posts_total") val total: Int = -1,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
