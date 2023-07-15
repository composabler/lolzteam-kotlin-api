package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import me.topilov.data.tag.CustomMarketTag
import me.topilov.data.tag.MarketTag
import me.topilov.deserializer.MapDeserializer

@JsonIgnoreProperties(ignoreUnknown = true)
data class MarketUser(
    @JsonProperty("balance") val balance: Int = -1,
    @JsonProperty("hold") val hold: Int = -1,
    @JsonProperty("joinedDate") val joinedDate: Long = -1,
    @JsonProperty("sold_items_count") val soldItems: Int = -1,
    @JsonProperty("active_items_count") val activeItems: Int = -1,
    @JsonProperty("payout_count") val payoutCount: Int = -1,
    @JsonProperty("restore_count") val restoreCount: Int = -1,
    @JsonProperty("user_allow_ask_discount") val allowAskDiscount: Int = -1,
    @JsonProperty("currency") val currency: String = "null",
    @JsonProperty("max_discount_percent") val maxDiscountPercent: Int = -1,
    @JsonProperty("restore_data") val restoreData: String = "null",
    @JsonProperty("notice_first_sale") val noticeFirstSale: Int = -1,
    @JsonProperty("notice_first_payout") val noticeFirstPayout: Int = -1,
    @JsonProperty("has_ignored_items") val hasIgnoredItems: Int = -1,
    @JsonProperty("domain") val domain: String = "null",
    val checkBan: Int = -1,
    val disableSteamGuard: Int = -1,
    val hideFavourites: Int = -1,
    @JsonDeserialize(using = MapDeserializer::class)
    val tags: Map<String, MarketTag> = emptyMap(),
    val allowAcceptAccounts: String = "null",
    val searchBanEndDate: Long = -1,
    val vkUa: String = "null",
    val telegramClient: String = "null",
    val paymentStats: String = "null",
    val currencyPhrase: String = "null",
    val sourceBalance: Int = -1,
    val sourceHold: Int = -1,
    @JsonDeserialize(using = MapDeserializer::class)
    val customTags: Map<String, CustomMarketTag> = emptyMap(),
    val hasCustomTags: Boolean = false,
) : User()