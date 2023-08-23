package me.topilov.data.accounts

import com.fasterxml.jackson.annotation.JsonProperty

enum class AccountState {
    @JsonProperty("active")
    ACTIVE,
    @JsonProperty("awaiting")
    AWAITING,
    @JsonProperty("closed")
    CLOSED,
    ;
}