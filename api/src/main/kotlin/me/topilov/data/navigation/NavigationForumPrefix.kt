package me.topilov.data.navigation

import com.fasterxml.jackson.annotation.JsonProperty

data class NavigationForumPrefix(
    @JsonProperty("group_prefixes") val groupPrefixes: List<NavigationGroupPrefix>,
    @JsonProperty("group_title") val groupTitle: String
)