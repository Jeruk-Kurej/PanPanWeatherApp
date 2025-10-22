package com.jeruk.panpanweatherapp.ui.model

data class PanPan(
    val cityName: String = "",
    val dateTime: Int = 0,
    val weatherIconCode: String = "",
    val weatherCondition: String = "",
    val temperature: Double = 0.0,
    val humidity: Int = 0,
    val windSpeed: Double = 0.0,
    val feelsLike: Double = 0.0,
    val rainFallLastHour: Double? = null,
    val pressure: Int = 0,
    val cloudsAll: Int = 0,
    val sunriseTime: Int = 0,
    val sunsetTime: Int = 0,
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)