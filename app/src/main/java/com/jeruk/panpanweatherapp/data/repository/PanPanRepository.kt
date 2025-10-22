package com.jeruk.panpanweatherapp.data.repository

import com.jeruk.panpanweatherapp.data.service.PanPanService
import com.jeruk.panpanweatherapp.ui.model.PanPan

class PanPanRepository(private val service: PanPanService) {

    suspend fun PanPanPan(): PanPan {
        val PanPan = service.getCurrentWeather(
            cityName = "tokyo",
            units = "metric",
            apiKey = "c41d64b799325960010c4b23acfa4a86"
        ).body()!!

        return PanPan(
            cityName = PanPan.name,
            dateTime = PanPan.dt,

            weatherIconCode = PanPan.weather[0].icon,
            weatherCondition = PanPan.weather[0].main,
            temperature = PanPan.main.temp,

            humidity = PanPan.main.humidity,
            windSpeed = PanPan.wind.speed,
            feelsLike = PanPan.main.feels_like,
            rainFallLastHour = PanPan.rain.`1h`,
            pressure = PanPan.main.pressure,
            cloudsAll = PanPan.clouds.all,

            sunriseTime = PanPan.sys.sunrise,
            sunsetTime = PanPan.sys.sunset,

            isLoading = false,
            errorMessage = null
        )

    }

}