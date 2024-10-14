package com.registromascotas

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.*
import com.registromascotas.data.Mascota
import com.registromascotas.ui.FormularioRegistro
import com.registromascotas.ui.ListaMascotas
import com.registromascotas.ui.theme.RegistroMascotasTheme

@Composable
fun App() {
    RegistroMascotasTheme {
        var mascotas by remember { mutableStateOf(listOf<Mascota>()) }

        Column {
            // Formulario para registrar una mascota
            FormularioRegistro { nuevaMascota ->
                mascotas = mascotas + nuevaMascota
            }

            // Lista de mascotas
            ListaMascotas(
                mascotas = mascotas,
                onEliminarMascota = { mascota ->
                    mascotas = mascotas - mascota
                }
            )
        }
    }
}