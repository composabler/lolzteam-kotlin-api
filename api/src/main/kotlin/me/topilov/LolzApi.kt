package me.topilov

import mapper
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import me.topilov.interceptor.AuthInterceptor
import me.topilov.interceptor.RateLimitInterceptor
import me.topilov.service.ForumApiService
import me.topilov.service.MarketApiService
import java.util.concurrent.TimeUnit

class LolzApi(
    token: String,
    forumApiUrl: String = "https://api.zelenka.guru",
    marketApiUrl: String = "https://api.lzt.market",
) {

    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(RateLimitInterceptor())
        .addInterceptor(AuthInterceptor(token))
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()

    private val forumRetrofit = Retrofit.Builder()
        .baseUrl(forumApiUrl)
        .client(okHttpClient)
        .addConverterFactory(JacksonConverterFactory.create(mapper))
        .build()

    private val marketRetrofit = Retrofit.Builder()
        .baseUrl(marketApiUrl)
        .client(okHttpClient)
        .addConverterFactory(JacksonConverterFactory.create(mapper))
        .build()

    val forumApiService = forumRetrofit.create(ForumApiService::class.java)

    val marketApiService = marketRetrofit.create(MarketApiService::class.java)
}