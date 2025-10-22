package com.jeruk.panpanweatherapp.data.container

import com.google.gson.GsonBuilder
import com.jeruk.panpanweatherapp.data.repository.PanPanRepository
import com.jeruk.panpanweatherapp.data.service.PanPanService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.getValue

class PanPanContainer {

    companion object {
        private const val BASE_URL = "https://api.openweathermap.org/"
    }

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
        .build()

    private val panPanService: PanPanService by lazy {
        retrofit.create(PanPanService::class.java)
    }

    val panPanRepository: PanPanRepository by lazy {
        PanPanRepository(panPanService)
    }

}