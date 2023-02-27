import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

fun coroutine(block: suspend CoroutineScope.() -> Unit) = CoroutineScope(Dispatchers.IO).launch { block() }

val mapper = jacksonObjectMapper()

fun <K, V> mapOfNotNull(vararg entries: Pair<K, V>): Map<K, V> {
    return entries.filter { it.second != null }.toMap()
}