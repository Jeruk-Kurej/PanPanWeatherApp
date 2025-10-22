package com.jeruk.panpanweatherapp.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PanPanWeatherApp(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        OutlinedTextField(
            value = "",
            onValueChange = {},
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