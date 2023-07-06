package me.topilov.data.item

import com.fasterxml.jackson.annotation.JsonProperty

enum class ItemOrigin {
    @JsonProperty("retrive")
    RETRIVE,
    @JsonProperty("autoreg")
    AUTOREG,
    @JsonProperty("resale")
    RESALE,
    @JsonProperty("personal")
    PERSONAL,
    @JsonProperty("stealer")
    STEALER,
    @JsonProperty("fishing")
    FISHING,
    @JsonProperty("brute")
    BRUTE, ;
}