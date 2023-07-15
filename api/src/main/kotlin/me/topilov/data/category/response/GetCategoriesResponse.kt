package me.topilov.data.category.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.category.Category

data class GetCategoriesResponse(
    @JsonProperty("categories") val categories: List<Category> = emptyList(),
    @JsonProperty("categories_total") val total: Int,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
