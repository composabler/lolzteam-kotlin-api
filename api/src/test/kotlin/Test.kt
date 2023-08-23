
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import me.topilov.LolzApi
import org.junit.Test
import java.io.File


class Test {

   val TOKEN = System.getenv("TOKEN")
   val USER_ID = System.getenv("USER_ID").toInt()

   val api = LolzApi(TOKEN)

   @Test
   fun test(): Unit = runBlocking {
      val file = File("C:/Users/Pavel/Downloads/vara/pic97.jpg").readBytes()
      api.forumApiService.uploadAvatar(userId = USER_ID, avatar = file)
      delay(10000)
   }
}