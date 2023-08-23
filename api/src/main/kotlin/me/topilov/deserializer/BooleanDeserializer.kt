package me.topilov.deserializer

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer

object BooleanDeserializer : JsonDeserializer<Boolean>() {

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): Boolean {

        val chars = p.textCharacters

        if (chars.isEmpty()) {
            return false
        }

        val start = p.textOffset
        val isBool = chars[start].toString()

        return isBool in "TtYy1"
    }
}