package me.topilov.interceptor

import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor(private val token: String) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val requestBuilder = chain.request().newBuilder()
            .header("Authorization", "Bearer $token")
        val request = requestBuilder.build()
        return chain.proceed(request)
    }
}