package me.topilov.data.page.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.page.Page

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetPagesResponse(
    @JsonProperty("pages") val pages: List<Page> = emptyList(),
    @JsonProperty("pages_total") val total: Int = -1,
    @JsonProperty("system_info") val systemInfo: SystemInfo = SystemInfo(),
)
