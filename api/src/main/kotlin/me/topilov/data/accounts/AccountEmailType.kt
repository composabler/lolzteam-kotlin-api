package me.topilov.data.accounts

import com.fasterxml.jackson.annotation.JsonProperty

enum class AccountEmailType {
    @JsonProperty("native")
    NATIVE,
    @JsonProperty("autoreg")
    AUTOREG,
    @JsonProperty("")
    NONE
    ;
}