package com.registromascotas

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.*
import com.registromascotas.data.Mascota
import com.registromascotas.ui.FormularioRegistro

@Composable
fun App() {
    var mascotas by remember { mutableStateOf(listOf<Mascota>()) }

    Column {
        // Formulario para registrar una mascota
        FormularioRegistro { nuevaMascota ->
            mascotas = mascotas + nuevaMascota
        }
    }
}