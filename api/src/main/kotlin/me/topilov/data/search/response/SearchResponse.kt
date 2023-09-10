package me.topilov.data.search.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.thread.Thread
import me.topilov.data.thread.ThreadsLinks

data class SearchResponse(
    @JsonProperty("data") val data: List<Thread>,
    @JsonProperty("data_total") val dataTotal: Int,
    @JsonProperty("links") val links: ThreadsLinks,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
