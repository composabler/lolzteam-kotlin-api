
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import me.topilov.LolzApi
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody.Companion.asRequestBody
import org.junit.Test
import java.io.File


class Test {

   val TOKEN = System.getenv("TOKEN")
   val USER_ID = System.getenv("USER_ID").toInt()

   val api = LolzApi(TOKEN)

   @Test
   fun test(): Unit = runBlocking {
      val file = File("C:/Users/Pavel/Downloads/vara/pic97.jpg")
      val part = MultipartBody.Part.createFormData("avatar", file.name, file.asRequestBody("image/*".toMediaTypeOrNull()))
      api.forumApiService.uploadAvatar(USER_ID, part)
      delay(10000)
   }
}