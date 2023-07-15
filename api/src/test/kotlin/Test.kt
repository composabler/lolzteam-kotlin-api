import kotlinx.coroutines.runBlocking
import me.topilov.LolzApi
import me.topilov.data.profilePost.request.GetProfilePostLikesBatchRequest
import me.topilov.data.profilePost.response.GetProfilePostLikesResponse
import org.junit.Ignore
import org.junit.Test


@Ignore
class Test {

   val TOKEN = System.getenv("TOKEN")
   val USER_ID = System.getenv("USER_ID").toInt()

   val api = LolzApi(TOKEN)

   @Test
   fun test(): Unit = runBlocking {
      println(api.forumApiService.getNotifications())
   }
}