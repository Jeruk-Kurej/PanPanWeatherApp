package com.jeruk.panpanweatherapp.ui.model

data class PanPan(
    val cityName: String,               // Dari JSON: "name"
    val dateTime: Int,   // Dari JSON: "dt" (timestamp dalam detik)

    val weatherIconCode: String,      // Dari JSON: "weather[0].icon"
    val weatherCondition: String,     // Dari JSON: "weather[0].main"
    val temperature: Double,          // Dari JSON: "main.temp"

    val humidity: Int,                // Dari JSON: "main.humidity"
    val windSpeed: Double,            // Dari JSON: "wind.speed"
    val feelsLike: Double,            // Dari JSON: "main.feels_like"
    val rainFallLastHour: Double?,    // Dari JSON: "rain.1h" (bisa null jika tidak hujan)
    val pressure: Int,                // Dari JSON: "main.pressure"
    val cloudsAll: Int,               // Dari JSON: "clouds.all" (persentase awan)

    val sunriseTime: Int,    // Dari JSON: "sys.sunrise" (timestamp dalam detik)
    val sunsetTime: Int,     // Dari JSON: "sys.sunset" (timestamp dalam detik)

    val isLoading: Boolean = false,
    val errorMessage: String? = null
)