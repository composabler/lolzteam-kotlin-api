package me.topilov.data.category.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.category.Category

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetCategoryResponse(
    @JsonProperty("category") val category: Category? = null,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
