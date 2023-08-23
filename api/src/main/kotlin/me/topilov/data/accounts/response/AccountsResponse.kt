package me.topilov.data.accounts.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import convertValueToList
import mapper
import me.topilov.data.SystemInfo

data class AccountsResponse(
    @JsonProperty("items") val itemsJson: JsonNode,
    @JsonProperty("totalItems") val totalItems: Int,
    @JsonProperty("totalItemsPrice") val totalItemsPrice: Int,
    @JsonProperty("perPage") val perPage: Int,
    @JsonProperty("page") val page: Int,
    @JsonProperty("cacheTTL") val cacheTtl: Long,
    @JsonProperty("lastModified") val lastModified: Long,
    @JsonProperty("searchUrl") val searchUrl: String,
    @JsonProperty("stickyItems") val stickyItems: JsonNode,
    @JsonProperty("isIsolatedMarket") val isIsolatedMarket: Boolean,
    @JsonProperty("isIsolatedMarketAlt") val isIsolatedMarketAlt: Boolean,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
) {

    inline fun <reified T> getItems() = mapper.convertValueToList<T>(itemsJson)
}