package me.topilov.data.tag

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class Tag(
    @JsonProperty("tag_id") val id: Int,
    @JsonProperty("tag_text") val text: String,
    @JsonProperty("tag_use_count") val useCount: Int,
    @JsonProperty("links") val links: TagLinks,
)
