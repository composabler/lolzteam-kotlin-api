package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import me.topilov.data.tag.CustomMarketTag
import me.topilov.data.tag.MarketTag
import me.topilov.deserializer.MapDeserializer

data class MarketUser(
    @JsonProperty("balance") val balance: Int,
    @JsonProperty("hold") val hold: Int,
    @JsonProperty("joinedDate") val joinedDate: Long,
    @JsonProperty("sold_items_count") val soldItems: Int,
    @JsonProperty("active_items_count") val activeItems: Int,
    @JsonProperty("payout_count") val payoutCount: Int,
    @JsonProperty("restore_count") val restoreCount: Int,
    @JsonProperty("user_allow_ask_discount") val allowAskDiscount: Int,
    @JsonProperty("currency") val currency: String,
    @JsonProperty("max_discount_percent") val maxDiscountPercent: Int,
    @JsonProperty("restore_data") val restoreData: String,
    @JsonProperty("notice_first_sale") val noticeFirstSale: Int,
    @JsonProperty("notice_first_payout") val noticeFirstPayout: Int,
    @JsonProperty("has_ignored_items") val hasIgnoredItems: Int,
    @JsonProperty("domain") val domain: String,
    val checkBan: Int,
    val disableSteamGuard: Int,
    val hideFavourites: Int,
    @JsonDeserialize(using = MapDeserializer::class)
    val tags: Map<String, MarketTag> = emptyMap(),
    val allowAcceptAccounts: String,
    val searchBanEndDate: Long,
    val vkUa: String,
    val telegramClient: String,
    val paymentStats: String,
    val currencyPhrase: String,
    val sourceBalance: Int,
    val sourceHold: Int,
    @JsonDeserialize(using = MapDeserializer::class)
    val customTags: Map<String, CustomMarketTag> = emptyMap(),
    val hasCustomTags: Boolean,
) // todo: extend by User