package me.topilov.data.tag

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class MarketTag(
    @JsonProperty("title") val title: String,
    @JsonProperty("bc") val bc: String,
    @JsonProperty("tag_id") val id: Int,
    @JsonProperty("forOwnedAccountsOnly") val forOwnedAccountsOnly: Boolean,
)
