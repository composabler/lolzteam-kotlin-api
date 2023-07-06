package me.topilov.deserializer

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.JsonNode

class MapDeserializer<K, V> : JsonDeserializer<Map<K, V>>() {

    @Suppress("UNCHECKED_CAST")
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): Map<K, V> {
        val node = p.codec.readTree<JsonNode>(p)
        return if (node.isArray) {
            emptyMap()
        } else {
            node.fields().asSequence().associate { it.key as K to it.value as V }
        }
    }
}