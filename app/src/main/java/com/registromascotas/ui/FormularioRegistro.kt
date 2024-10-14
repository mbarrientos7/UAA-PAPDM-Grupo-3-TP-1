package com.registromascotas.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.registromascotas.data.Mascota

@Composable
fun FormularioRegistro(onRegistrarMascota: (Mascota) -> Unit) {
    var nombre by remember { mutableStateOf("") }
    var especie by remember { mutableStateOf("") }
    var raza by remember { mutableStateOf("") }
    var edad by remember { mutableStateOf("") }
    var peso by remember { mutableStateOf("") }
    var fotoUrl by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "Registrar Nueva Mascota",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(bottom = 8.dp),
            fontWeight = FontWeight.Bold
        )

        TextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("Nombre") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        TextField(
            value = especie,
            onValueChange = { especie = it },
            label = { Text("Especie") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        TextField(
            value = raza,
            onValueChange = { raza = it },
            label = { Text("Raza") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        TextField(
            value = edad,
            onValueChange = { edad = it },
            label = { Text("Edad (años)") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
        )
        TextField(
            value = peso,
            onValueChange = { peso = it },
            label = { Text("Peso (kg)") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
        )
        TextField(
            value = fotoUrl,
            onValueChange = { fotoUrl = it },
            label = { Text("URL de la Foto") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )

        Button(
            onClick = {
                if (nombre.isNotBlank() && especie.isNotBlank() && fotoUrl.isNotBlank()) {
                    val edadInt = edad.toIntOrNull() ?: 0
                    val pesoFloat = peso.toFloatOrNull() ?: 0f

                    val nuevaMascota = Mascota(nombre, especie, raza, edadInt, pesoFloat, fotoUrl)
                    onRegistrarMascota(nuevaMascota)

                    nombre = ""
                    especie = ""
                    raza = ""
                    edad = ""
                    peso = ""
                    fotoUrl = ""
                }
            },

            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary)
        ) {
            Text("Registrar Mascota")
        }
    }
}