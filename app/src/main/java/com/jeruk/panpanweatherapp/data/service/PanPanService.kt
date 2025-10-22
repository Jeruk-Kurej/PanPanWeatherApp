package com.jeruk.panpanweatherapp.data.service

import com.jeruk.panpanweatherapp.data.dto.ResponseWeather
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PanPanService {

    @GET("data/2.5/weather")
    suspend fun getCurrentWeather(
        @Query("q") cityName: String,

        @Query("units") units: String = "metric",

        @Query("appid") apiKey: String
    ): Response<ResponseWeather>

}