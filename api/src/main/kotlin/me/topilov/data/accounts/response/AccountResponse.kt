package me.topilov.data.accounts.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import convertValueOrNull
import convertValueToMap
import mapper
import me.topilov.data.SystemInfo

data class AccountResponse(
    @JsonProperty("item") val itemJson: JsonNode,
    @JsonProperty("canStickItem") val canStickItem: Boolean,
    @JsonProperty("canUnstickItem") val canUnstickItem: Boolean,
    @JsonProperty("canBuyItem") val canBuyItem: Boolean,
    @JsonProperty("cannotBuyItemError") val cannotBuyItemError: String,
    @JsonProperty("canCloseItem") val canCloseItem: Boolean,
    @JsonProperty("canOpenItem") val canOpenItem: Boolean,
    @JsonProperty("canReportItem") val canReportItem: Boolean,
    @JsonProperty("canEditItem") val canEditItem: Boolean,
    @JsonProperty("canDeleteItem") val canDeleteItem: Boolean,
    @JsonProperty("canCancelConfirmedBuy") val canCancelConfirmedBuy: Boolean,
    @JsonProperty("canViewItemHistory") val canViewItemHistory: Boolean,
    @JsonProperty("faveCount") val faveCount: Boolean,
    @JsonProperty("isVisibleItem") val isVisibleItem: Boolean,
    @JsonProperty("canViewLoginData") val canViewLoginData: Boolean,
    @JsonProperty("sameItems") val sameItemsJson: JsonNode,
    @JsonProperty("sameItemsCount") val sameItemsCount: Int,
    @JsonProperty("showToFavouritesButton") val showToFavouritesButton: Boolean,
    @JsonProperty("itemLink") val itemLink: String,
    @JsonProperty("canChangeOwner") val canChangeOwner: Boolean,
    @JsonProperty("isIsolatedMarket") val isIsolatedMarket: Boolean,
    @JsonProperty("isIsolatedMarketAlt") val isIsolatedMarketAlt: Boolean,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
) {

    inline fun <reified T> getItem() = mapper.convertValueOrNull(itemJson, T::class.java)

    inline fun <K, reified V> getSameItems() = mapper.convertValueToMap<K, V>(sameItemsJson)
}
