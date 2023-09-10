package me.topilov.data.navigation

import com.fasterxml.jackson.annotation.JsonProperty

data class NavigationGroupPrefix(
    @JsonProperty("prefix_id") val prefixId: Int,
    @JsonProperty("prefix_title") val prefixTitle: String
)