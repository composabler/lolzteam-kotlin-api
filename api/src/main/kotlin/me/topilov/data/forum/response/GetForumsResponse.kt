package me.topilov.data.forum.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.forum.Forum

data class GetForumsResponse(
    @JsonProperty("forums") val forums: List<Forum> = emptyList(),
    @JsonProperty("forums_total") val total: Int,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
