package me.topilov.data.tag

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Tag(
    @JsonProperty("tag_id") val id: Int = -1,
    @JsonProperty("tag_text") val text: String = "null",
    @JsonProperty("tag_use_count") val useCount: Int = -1,
    @JsonProperty("links") val links: TagLinks = TagLinks(),
)
