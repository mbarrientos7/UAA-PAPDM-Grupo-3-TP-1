package com.registromascotas.data

data class Mascota(
    val nombre: String,
    val especie: String,
    val raza: String,
    val edad: Int,
    val peso: Float,
    val fotoUrl: String
)
