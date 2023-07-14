import com.fasterxml.jackson.databind.DeserializationConfig
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.module.kotlin.KotlinFeature
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

val Scope = CoroutineScope(Dispatchers.IO + SupervisorJob())

fun coroutine(block: suspend CoroutineScope.() -> Unit) = Scope.launch { block() }

private val kotlinModule: SimpleModule = KotlinModule.Builder()
.withReflectionCacheSize(512)
.configure(KotlinFeature.NullToEmptyCollection, false)
.configure(KotlinFeature.NullToEmptyMap, false)
.configure(KotlinFeature.NullIsSameAsDefault, true)
.configure(KotlinFeature.SingletonSupport, false)
.configure(KotlinFeature.StrictNullChecks, false)
.build()

val mapper = jacksonObjectMapper()
    .registerModule(kotlinModule)
    .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

fun <K, V> mapOfNotNull(vararg entries: Pair<K, V>): Map<K, V> {
    return entries.filter { it.second != null }.toMap()
}