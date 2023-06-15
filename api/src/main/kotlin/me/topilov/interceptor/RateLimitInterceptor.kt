package me.topilov.interceptor

import com.google.common.util.concurrent.RateLimiter
import okhttp3.Interceptor
import okhttp3.Response

class RateLimitInterceptor : Interceptor {

    private val limiter = RateLimiter.create(0.2)

    override fun intercept(chain: Interceptor.Chain): Response {
        limiter.acquire()
        return chain.proceed(chain.request())
    }
}