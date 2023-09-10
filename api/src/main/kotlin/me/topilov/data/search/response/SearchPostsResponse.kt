package me.topilov.data.search.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.post.PostLinks
import me.topilov.data.post.RawPost
import me.topilov.data.thread.Thread

data class SearchPostsResponse(
    @JsonProperty("posts") val posts: List<RawPost>,
    @JsonProperty("data") val data: List<Thread>,
    @JsonProperty("links") val links: PostLinks,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)