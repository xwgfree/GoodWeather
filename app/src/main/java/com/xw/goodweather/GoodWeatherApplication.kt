package com.xw.goodweather

import android.app.Application
import android.content.Context

/**
* “缺Context”的情况 解决
 * GoodWeatherApplication.context来获取Context对象了
* */

class GoodWeatherApplication : Application() {
    companion object {
        // 令牌
        const val TOKEN = "E9cISk08bm9FzqXg"
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}