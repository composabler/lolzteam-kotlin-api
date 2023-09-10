package me.topilov.data.search.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.tag.TagsLinks
import me.topilov.data.thread.Thread

data class SearchTaggedResponse(
    @JsonProperty("data") val data: List<Thread>,
    @JsonProperty("data_total") val dataTotal: Int,
    @JsonProperty("search_tags") val searchTags: Map<Int, String>,
    @JsonProperty("links") val links: TagsLinks,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
