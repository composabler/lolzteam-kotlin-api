package me.topilov.data.page.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.page.Page

data class PageResponse(
    @JsonProperty("page") val page: Page?,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
