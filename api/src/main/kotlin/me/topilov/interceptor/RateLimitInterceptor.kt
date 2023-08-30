package me.topilov.interceptor

import okhttp3.Interceptor
import okhttp3.Response

class RateLimitInterceptor : Interceptor {

    private var limitBefore = 0L

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        var response = chain.proceed(request)

        if (response.code == 429) {
            val timeout = limitBefore - System.currentTimeMillis()
            val currentTimeout = timeout.coerceAtLeast(1000L)
            Thread.sleep(currentTimeout)
            response.close()
            response = chain.proceed(request)
        }

        limitBefore = System.currentTimeMillis() + 3000
        return response
    }
}