package me.topilov.data.tag.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import me.topilov.data.SystemInfo
import me.topilov.data.tag.TagsLinks
import me.topilov.deserializer.MapDeserializer

data class GetTagsResponse(
    @JsonDeserialize(using = MapDeserializer::class)
    @JsonProperty("tags") val tags: Map<String, String> = emptyMap(),
    @JsonProperty("tags_total") val total: Int,
    @JsonProperty("links") val links: TagsLinks,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)