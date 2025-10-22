package com.jeruk.panpanweatherapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jeruk.panpanweatherapp.data.container.PanPanContainer
import com.jeruk.panpanweatherapp.ui.model.PanPan
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PanPanViewModel : ViewModel() {

    private val _weather = MutableStateFlow(PanPan())

    val weather: StateFlow<PanPan> = _weather

    init {
        loadWeather()
    }

    fun loadWeather() {
        viewModelScope.launch {
            _weather.value = PanPanContainer().panPanRepository.PanPanPan()
        }
    }

}