package me.topilov.data.search.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import me.topilov.data.SystemInfo
import me.topilov.data.post.RawPost
import me.topilov.data.search.SearchLinks

data class SearchPostsResponse(
    @JsonProperty("posts") val posts: List<RawPost>,
    @JsonProperty("data") val dataJson: JsonNode,
    @JsonProperty("links") val links: SearchLinks,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)