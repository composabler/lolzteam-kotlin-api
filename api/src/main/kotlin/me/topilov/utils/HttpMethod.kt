package me.topilov.utils

import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.annotation.JsonNaming

enum class HttpMethod {

    GET,
    POST,
    PUT,
    DELETE, ;

    @JsonValue
    override fun toString(): String {
        return name
    }
}