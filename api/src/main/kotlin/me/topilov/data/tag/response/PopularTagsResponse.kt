package me.topilov.data.tag.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo

data class PopularTagsResponse(
    @JsonProperty("tag") val tag: Map<Int, String>,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
