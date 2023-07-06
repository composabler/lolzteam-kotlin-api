package me.topilov.data.item

import com.fasterxml.jackson.annotation.JsonProperty

enum class ItemState {
    @JsonProperty("item_state")
    ACTIVE,
    @JsonProperty("awaiting")
    AWAITING,
    @JsonProperty("closed")
    CLOSED,
    ;
}