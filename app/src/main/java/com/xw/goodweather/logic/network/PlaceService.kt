package com.xw.goodweather.logic.network

import com.xw.goodweather.GoodWeatherApplication
import com.xw.goodweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {

    @GET("v2/place?token=${GoodWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
    //这样Retrofit 就会将服务器返回的JSON数据自动解析成PlaceResponse对象了
}