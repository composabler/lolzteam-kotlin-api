package me.topilov.data.forum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class ForumGroupPrefix(
    @JsonProperty("prefix_id") val id: Int = -1,
    @JsonProperty("prefix_title") val title: String = "null",
)
