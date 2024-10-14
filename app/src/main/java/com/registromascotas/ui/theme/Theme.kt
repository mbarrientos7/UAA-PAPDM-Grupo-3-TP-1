package com.registromascotas.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFFFFC1E3),
    onPrimary = Color.White,
    background = Color(0xFFFFE4E1),
    surface = Color.White,
    onSurface = Color.Black,
    onBackground = Color.Black,
)

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFFB0BEC5),
    onPrimary = Color.White,
    background = Color(0xFF37474F),
    surface = Color(0xFF455A64),
    onSurface = Color.White,
    onBackground = Color.White,
)

@Composable
fun RegistroMascotasTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}