import kotlinx.coroutines.runBlocking
import me.topilov.LolzApi

val TOKEN = System.getenv("TOKEN")

fun main(): Unit = runBlocking {
    val api = LolzApi(TOKEN)
    println(api.searchTagged(tags = listOf("test")))
}