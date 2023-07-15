import kotlinx.coroutines.runBlocking
import me.topilov.LolzApi
import org.junit.Ignore
import org.junit.Test


@Ignore
class Test {

   val TOKEN = System.getenv("TOKEN")
   val USER_ID = System.getenv("USER_ID").toInt()

   val api = LolzApi(TOKEN)

   @Test
   fun test(): Unit = runBlocking {
      api.forumApiService.getUser(USER_ID)
   }
}