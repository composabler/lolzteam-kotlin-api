package me.topilov.data.forum

import com.fasterxml.jackson.annotation.JsonProperty

data class ForumPrefix(
    @JsonProperty("group_title") val groupTitle: String,
    @JsonProperty("group_prefixes") val groupPrefixes: List<ForumGroupPrefix> = emptyList(),
)
