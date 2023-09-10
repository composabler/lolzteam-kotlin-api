package me.topilov.data.navigation.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.navigation.NavigationElement

data class NavigationElementsResponse(
    @JsonProperty("elements") val elements: List<NavigationElement>,
    @JsonProperty("elements_count") val elementsCount: Int,
    @JsonProperty("system_info") val systemInfo: SystemInfo
)