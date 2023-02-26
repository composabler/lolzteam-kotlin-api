package me.topilov.data.tag.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.tag.TagsLinks

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetTagsResponse(

    @JsonProperty("tags") val tags: Map<String, String> = emptyMap(),
    @JsonProperty("tags_total") val total: Int = -1,
    @JsonProperty("links") val links: TagsLinks = TagsLinks(),
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)