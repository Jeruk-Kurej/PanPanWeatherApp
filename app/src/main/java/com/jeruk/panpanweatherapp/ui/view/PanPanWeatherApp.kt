package com.jeruk.panpanweatherapp.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.jeruk.panpanweatherapp.ui.viewmodel.PanPanViewModel

@Composable
fun PanPanWeatherApp(
    modifier: Modifier = Modifier,
    viewModel: PanPanViewModel = viewModel()
) {

    val weatherState by viewModel.weather.collectAsState()
    var userInputCityName by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        OutlinedTextField(
            value = userInputCityName,
            onValueChange = { userInputCityName = it },
            placeholder = {
                Text(
                    "Enter city name..."
                )
            }
        )

    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
private fun PanPanWeatherAppPreview() {
    PanPanWeatherApp()
}