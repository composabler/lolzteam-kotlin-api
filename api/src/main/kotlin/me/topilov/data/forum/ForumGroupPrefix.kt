package me.topilov.data.forum

import com.fasterxml.jackson.annotation.JsonProperty

data class ForumGroupPrefix(
    @JsonProperty("prefix_id") val id: Int,
    @JsonProperty("prefix_title") val title: String,
)
