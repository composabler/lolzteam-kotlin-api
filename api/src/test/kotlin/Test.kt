import kotlinx.coroutines.runBlocking
import me.topilov.LolzApi
import me.topilov.data.post.Post
import java.lang.Exception

fun main(): Unit = runBlocking {
    val api = LolzApi(TOKEN)

    while (true) {
        val posts = api.searchPosts(userId = 2765220).posts
        println("posts size ${posts.size}")
        posts.forEach { rawPost ->
            val post = api.getPost(rawPost.postId).post ?: return@forEach
            if (post.permissions.delete) {
                api.deletePost(post.id)
            } else {
                println("cant delete")
            }
        }
    }
}