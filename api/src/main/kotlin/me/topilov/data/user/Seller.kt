package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonProperty

data class Seller(
    @JsonProperty("user_id") val id: Int,
    @JsonProperty("sold_items_count") val soldItems: Int,
    @JsonProperty("restore_data") val restoreData: String,
    @JsonProperty("username") val username: String,
    @JsonProperty("avatar_date") val avatarDate: Long,
    @JsonProperty("is_banned") val isBanned: Boolean,
    @JsonProperty("display_style_group_id") val displayGroup: Int,
    @JsonProperty("uniq_username_css") val uniqUsernameCss: String,
    @JsonProperty("restore_percents") val restorePercents: Int,
)
