package me.topilov.data.page

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Page(
    @JsonProperty("page_id") val id: Int = -1,
    @JsonProperty("page_title") val title: String = "null",
    @JsonProperty("page_description") val description: String = "null",
    @JsonProperty("page_view_count") val views: Int = -1,
    @JsonProperty("page_html") val html: String = "null",
    @JsonProperty("links") val links: PageLinks = PageLinks(),
    @JsonProperty("permissions") val permissions: PagePermissions = PagePermissions(),
)
