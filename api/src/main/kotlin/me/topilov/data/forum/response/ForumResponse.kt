package me.topilov.data.forum.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.forum.Forum

data class ForumResponse(
    @JsonProperty("forum") val forum: Forum?,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
