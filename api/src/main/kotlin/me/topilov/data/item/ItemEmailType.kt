package me.topilov.data.item

import com.fasterxml.jackson.annotation.JsonProperty

enum class ItemEmailType {
    @JsonProperty("native")
    NATIVE,
    @JsonProperty("autoreg")
    AUTOREG, ;
}