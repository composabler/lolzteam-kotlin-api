package me.topilov.data.tag

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import me.topilov.deserializer.MapDeserializer

@JsonIgnoreProperties(ignoreUnknown = true)
data class Tags(
    @JsonDeserialize(using = MapDeserializer::class)
    @JsonProperty("tags") val tags: Map<String, String> = emptyMap(),
    @JsonProperty("tags_total") val total: Int = -1,
    @JsonProperty("links") val links: TagsLinks = TagsLinks(),
)
