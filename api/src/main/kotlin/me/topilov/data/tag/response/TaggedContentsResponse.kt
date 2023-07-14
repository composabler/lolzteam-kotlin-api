package me.topilov.data.tag.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.tag.Tag
import me.topilov.data.tag.TagsLinks
import me.topilov.data.thread.Thread

data class GetTaggedContentsResponse(
    @JsonProperty("tag") val tag: Tag?,
    @JsonProperty("tagged") val tagged: List<Thread> = emptyList(),
    @JsonProperty("tagged_total") val total: Int,
    @JsonProperty("links") val links: TagsLinks,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
