package me.topilov.data.tag.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo

data class FindTagsResponse(
    @JsonProperty("tags") val tags: List<String> = emptyList(),
    @JsonProperty("ids") val ids: List<Int> = emptyList(),
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
