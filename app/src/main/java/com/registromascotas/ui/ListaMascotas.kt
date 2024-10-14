package com.registromascotas.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.registromascotas.data.Mascota

@Composable
fun ListaMascotas(mascotas: List<Mascota>, onEliminarMascota: (Mascota) -> Unit) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(mascotas) { mascota ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                elevation = CardDefaults.cardElevation(4.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Text(
                        text = mascota.nombre,
                        style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold),
                        modifier = Modifier
                            .padding(bottom = 8.dp)
                            .align(Alignment.CenterHorizontally)
                    )
                    LazyRow(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 8.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        item { Text(text = "Especie: ", fontWeight = FontWeight.Bold) }
                        item { Text(text = mascota.especie) }
                        item { Text(text = "Raza: ", fontWeight = FontWeight.Bold) }
                        item { Text(text = mascota.raza) }
                        item { Text(text = "Edad: ", fontWeight = FontWeight.Bold) }
                        item { Text(text = "${mascota.edad} años") }
                        item { Text(text = "Peso: ", fontWeight = FontWeight.Bold) }
                        item { Text(text = "${mascota.peso} kg") }
                    }
                }
            }
        }
    }
}

