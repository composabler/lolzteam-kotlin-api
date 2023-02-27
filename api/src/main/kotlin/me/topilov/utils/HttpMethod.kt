package me.topilov.utils

import com.fasterxml.jackson.annotation.JsonValue

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