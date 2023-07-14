package me.topilov.data.category.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.category.Category

data class CategoryResponse(
    @JsonProperty("category") val category: Category?,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
