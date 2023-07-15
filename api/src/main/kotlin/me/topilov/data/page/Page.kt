package me.topilov.data.page

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class Page(
    @JsonProperty("page_id") val id: Int,
    @JsonProperty("page_title") val title: String,
    @JsonProperty("page_description") val description: String,
    @JsonProperty("page_view_count") val views: Int,
    @JsonProperty("page_html") val html: String?,
    @JsonProperty("links") val links: PageLinks,
    @JsonProperty("permissions") val permissions: PagePermissions,
)
