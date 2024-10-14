package com.registromascotas.ui

import android.graphics.drawable.Drawable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import android.view.ViewGroup
import android.widget.ImageView
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import com.registromascotas.R
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

                    CargarImagenDesdeUrl(fotoUrl = mascota.fotoUrl)

                    Button(
                        onClick = { onEliminarMascota(mascota) },
                        colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.error),
                        modifier = Modifier
                            .align(Alignment.End)
                            .padding(top = 16.dp)
                    ) {
                        Text("Eliminar")
                    }
                }
            }
        }
    }
}

@Composable
fun CargarImagenDesdeUrl(fotoUrl: String) {
    val context = LocalContext.current

    var drawable by remember { mutableStateOf<Drawable?>(null) }

    LaunchedEffect(fotoUrl) {
        Glide.with(context)
            .load(fotoUrl)
            .into(object : CustomTarget<Drawable>() {
                override fun onResourceReady(resource: Drawable, transition: Transition<in Drawable>?) {
                    drawable = resource
                }

                override fun onLoadCleared(placeholder: Drawable?) {
                    drawable = placeholder
                }
            })
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        contentAlignment = Alignment.Center
    ) {
        AndroidView(
            factory = { ImageView(context).apply { clipToOutline = true } },
            update = { imageView ->
                drawable?.let {
                    imageView.setImageDrawable(it)
                } ?: run {
                    imageView.setImageDrawable(null)
                    imageView.setImageResource(R.drawable.placeholder)
                }
                imageView.layoutParams = ViewGroup.LayoutParams(200, 200)
                imageView.scaleType = ImageView.ScaleType.CENTER_CROP
                imageView.clipToOutline = true
            },
            modifier = Modifier
                .size(200.dp)
                .clip(RoundedCornerShape(16.dp))
        )
    }
}