import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinFeature
import com.fasterxml.jackson.module.kotlin.KotlinModule
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import me.topilov.deserializer.BooleanDeserializer

val Scope = CoroutineScope(Dispatchers.IO + SupervisorJob())

fun coroutine(block: suspend CoroutineScope.() -> Unit) = Scope.launch { block() }

inline fun <reified T> ObjectMapper.convertValueOrNull(fromValue: Any?, toClass: Class<T>): T? {
    return try {
        convertValue(fromValue, toClass)
    } catch (e: Exception) {
        null
    }
}

inline fun <reified T> ObjectMapper.convertValueToList(value: Any): List<T> {
    val items = convertValue(value, object : TypeReference<List<Map<String, Any>>>() {})
    return items.mapNotNull { item ->
        convertValueOrNull(item, T::class.java)
    }
}

inline fun <K, reified V> ObjectMapper.convertValueToMap(value: Any): Map<K, V> {
    val items = convertValue(value, object : TypeReference<Map<K, Map<String, Any>>>() {})
    return items.entries.associate { (key, value) ->
        key to convertValueOrNull(value, V::class.java)
    }.filterNotNullValues()
}

fun <K, V> Map<K, V?>.filterNotNullValues(): Map<K, V> =
    mapNotNull { (key, value) -> value?.let { key to it } }.toMap()

private val kotlinModule = KotlinModule.Builder()
    .withReflectionCacheSize(512)
    .configure(KotlinFeature.NullToEmptyCollection, false)
    .configure(KotlinFeature.NullToEmptyMap, false)
    .configure(KotlinFeature.NullIsSameAsDefault, true)
    .configure(KotlinFeature.SingletonSupport, false)
    .configure(KotlinFeature.StrictNullChecks, false)
    .build()
    .addDeserializer(Boolean::class.java, BooleanDeserializer)

val mapper: ObjectMapper = ObjectMapper()
    .registerModule(kotlinModule)
    .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
    .configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true)

fun <K, V> mapOfNotNull(vararg entries: Pair<K, V>): Map<K, V> {
    return entries.filter { it.second != null }.toMap()
}