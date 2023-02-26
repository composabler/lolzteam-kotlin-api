package me.topilov.data.thread.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.thread.Thread
import me.topilov.data.thread.ThreadsLinks

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetFollowedThreadsResponse(
    @JsonProperty("threads") val threads: List<Thread> = emptyList(),
    @JsonProperty("threads_total") val total: Int = -1,
    @JsonProperty("links") val links: ThreadsLinks = ThreadsLinks(),
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
