package com.jeruk.panpanweatherapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jeruk.panpanweatherapp.data.container.PanPanContainer
import com.jeruk.panpanweatherapp.ui.model.PanPan
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException

class PanPanViewModel : ViewModel() {

    private val _weather = MutableStateFlow(PanPan())

    val weather: StateFlow<PanPan> = _weather

    private val _weatherIconUrl = MutableStateFlow<String?>(null)
    val weatherIconUrl: StateFlow<String?> = _weatherIconUrl

    fun loadWeather(cityName: String) {
        viewModelScope.launch {
            _weather.value = _weather.value.copy(
                isError = false,
                errorMessage = null
            )

            try {
                val result = PanPanContainer().panPanRepository.PanPanPan(cityName)

                _weather.value = result.copy(
                    isError = false,
                    errorMessage = null
                )

                _weatherIconUrl.value = PanPanContainer().panPanRepository.getWeatherIcon(
                    result.weatherIconCode
                ).url

            } catch (e: Exception) {
                _weather.value = _weather.value.copy(
                    isError = true,
                    errorMessage = "HTTP 404 Not Found"
                )
                _weatherIconUrl.value = null
            }
        }
    }


}