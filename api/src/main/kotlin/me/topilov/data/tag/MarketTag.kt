package me.topilov.data.tag

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class MarketTag(
    @JsonProperty("title") val title: String = "null",
    @JsonProperty("bc") val bc: String = "null",
    @JsonProperty("tag_id") val id: Int = -1,
    @JsonProperty("forOwnedAccountsOnly") val forOwnedAccountsOnly: Boolean = false,
)
