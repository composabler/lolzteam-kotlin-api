import kotlinx.coroutines.runBlocking
import me.topilov.LolzApi
import org.junit.Test
import java.util.*


class Test {

   val TOKEN = System.getenv("TOKEN")
   val USER_ID = System.getenv("USER_ID").toInt()

   val api = LolzApi(TOKEN)

   @Test
   fun test() = runBlocking {
      val response = api.forumApiService.createProfilePostComment(2942106, UUID.randomUUID().toString())
      println(response)
   }
}