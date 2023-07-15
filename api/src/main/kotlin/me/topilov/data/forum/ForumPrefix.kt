package me.topilov.data.forum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class ForumPrefix(
    @JsonProperty("group_title") val groupTitle: String = "null",
    @JsonProperty("group_prefixes") val groupPrefixes: List<ForumGroupPrefix> = emptyList(),
)
