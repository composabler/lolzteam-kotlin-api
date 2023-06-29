import kotlinx.coroutines.runBlocking
import me.topilov.LolzApi
import me.topilov.data.profilePost.request.GetProfilePostLikesBatchRequest
import me.topilov.data.profilePost.response.GetProfilePostLikesResponse
import org.junit.Test


class Test {

   val TOKEN = System.getenv("TOKEN")
   val USER_ID = System.getenv("USER_ID").toInt()

   val api = LolzApi(TOKEN)

   @Test
   fun test(): Unit = runBlocking {
      val list = arrayListOf<GetProfilePostLikesBatchRequest>()

      repeat(10) {
         list.add(GetProfilePostLikesBatchRequest(profilePostId = 2129128))
      }

      var sendIn: Long

      repeat(20) {
         sendIn = System.currentTimeMillis()
         val responseBatch = api.forumApiService.executeBatch(list.toList())
         println("GET ANSWER AFTER ${System.currentTimeMillis() - sendIn}")
         responseBatch.jobs.map { (uuid, _) ->
            responseBatch.getJob<GetProfilePostLikesResponse>(uuid)?.users
         }.also(::println)
      }
   }
}