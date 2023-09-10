package me.topilov.data.navigation

import com.fasterxml.jackson.annotation.JsonProperty

data class NavigationElement(
    @JsonProperty("category_description") val category_description: String,
    @JsonProperty("category_id") val category_id: Int,
    @JsonProperty("category_title") val category_title: String,
    @JsonProperty("forum_description") val forum_description: String,
    @JsonProperty("forum_id") val forum_id: Int,
    @JsonProperty("forum_is_followed") val forum_is_followed: Boolean,
    @JsonProperty("forum_post_count") val forum_post_count: Int,
    @JsonProperty("forum_prefixes") val forum_prefixes: List<NavigationForumPrefix>,
    @JsonProperty("forum_thread_count") val forum_thread_count: Int,
    @JsonProperty("forum_title") val forum_title: String,
    @JsonProperty("has_sub_elements") val has_sub_elements: Boolean,
    @JsonProperty("links") val links: NavigationLinks,
    @JsonProperty("navigation_depth") val navigationDepth: Int,
    @JsonProperty("navigation_id") val navigationId: Int,
    @JsonProperty("navigation_parent_id") val navigationPparentId: Int,
    @JsonProperty("navigation_type") val navigation_type: String,
    @JsonProperty("permissions") val permissions: NavigationPermissions,
    @JsonProperty("thread_default_prefix_id") val threadDefaultPrefixId: Int,
    @JsonProperty("thread_prefix_is_required") val threadPrefixIsRequired: Boolean
)