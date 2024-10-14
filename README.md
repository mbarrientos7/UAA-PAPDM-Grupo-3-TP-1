# Aplicacion Android de Registro de Mascotas

El repositorio corresponde al Trabajo Practico del Primer Parcial de la materia Programacion Avanzada para Dispositivos Moviles.

**Profesor:** Lic. Diego Bonnin

> [!TIP]
> ### Alumnos Responsables del Proyecto
> - Matias Agustin Barrientos Amarilla
> - Gonzalo Gabriel Garcia Bustamante
> - Diana Belen Alvarenga Zayas
> - Juan Carlos Garcete Gavilan

## Descripción

RegistroMascotas es una aplicación Android diseñada para permitir a los usuarios registrar y gestionar información sobre sus mascotas. La aplicación ofrece una interfaz intuitiva y moderna, utilizando Jetpack Compose para la construcción de la UI. Los usuarios pueden agregar nuevas mascotas, visualizar una lista de mascotas registradas y eliminar registros cuando sea necesario.

El sistema consiste en un formulario donde se cargaran datos de mascotas, tales como:

- Nombre
- Especie
- Raza
- Edad (En años)
- Peso (En Kg)
- Foto (URL de la imagen)

Una vez cargados se iran mostrando en una lista en la parte inferior de la pantalla, de esta manera:

![ImagenApp](https://github.com/user-attachments/assets/eda9c6d4-d124-4b14-9135-3b56179d01be)

Cada registro se podra eliminar de forma individual.

> [!IMPORTANT]
> Para el manejo de las imagenes mediante URL se utiliza la libreria de Glide, para tener mayor referencia, usar el siguiente enlace:
> https://github.com/bumptech/glide

## Funcionalidades

### Agregar una nueva mascota

> [!NOTE]
> Los videos a continuacion son una demostracion de como se realiza la carga de las mascotas en la App,
> en los mismos se podra apreciar los diseños que posee la aplicacion tanto en el tema claro, como en el tema oscuro

- ### Carga en Tema Claro
La aplicación soporta un tema claro que proporciona una experiencia visual amigable y accesible.

[Ver demostración](https://github.com/user-attachments/assets/56f5a8f1-e211-4c45-8b14-8cb48b3c2abd)

- ### Carga en Tema Oscuro
La aplicación también ofrece un tema oscuro, ideal para entornos con poca luz, mejorando la legibilidad y reduciendo la fatiga visual.

[Ver demostración](https://github.com/user-attachments/assets/5d90a3d2-d5a8-42a0-a03d-600201ebb832)

### Eliminación de Registros
> [!NOTE]
> Los usuarios pueden eliminar registros de mascotas de manera sencilla, asegurando que la lista de mascotas siempre esté actualizada.

[Ver demostración](https://github.com/user-attachments/assets/91b4ffe4-78e9-4837-bb5d-eb1c4b66e6af)

### Prevención de URL Inválida
> [!CAUTION]
> La aplicación incluye validaciones para asegurar que las URLs de las fotos de las mascotas sean válidas, evitando errores en la carga de imágenes.

[Ver demostración](https://github.com/user-attachments/assets/febed93b-bf82-4331-9ff8-69b1d92a3336)

## Tecnologías Utilizadas

- **Lenguaje de Programación**: Kotlin
- **Framework**: Jetpack Compose
- **Gestión de Dependencias**: Gradle
- **Carga de Imágenes**: Glide
- **Pruebas**: JUnit, Espresso

## Estructura del Proyecto

El proyecto está organizado de la siguiente manera:

```
📦com.registromascotas
 ┣ 📂data
 ┃ ┗ 📄Mascota.kt
 ┣ 📂ui
 ┃ ┣ 📄FormularioRegistro.kt
 ┃ ┣ 📄ListaMascotas.kt
 ┃ ┗ 📂theme
 ┃   ┣ 📄Color.kt
 ┃   ┣ 📄Theme.kt
 ┃   ┗ 📄Typography.kt
 ┣ 📄App.kt
 ┣ 📄MainActivity.kt
```

### Descripción de las carpetas y archivos:

- **`com.registromascotas`**: Carpeta principal que contiene el código de la aplicación.
  - **`data`**: Contiene las clases de datos.
    - `Mascota.kt`: Representa el modelo de datos de una mascota, con atributos como nombre, especie, raza, edad, peso y URL de la imagen.
  
  - **`ui`**: Contiene los componentes de la interfaz de usuario.
    - `FormularioRegistro.kt`: Define el formulario para registrar una nueva mascota. Permite ingresar datos como el nombre, especie, raza, edad, peso y URL de la imagen de la mascota.
    - `ListaMascotas.kt`: Muestra la lista de mascotas registradas utilizando `LazyColumn` y `LazyRow` para una mejor visualización y organización de los elementos.
    - **`theme`**: Incluye los recursos relacionados con el tema visual de la aplicación.
      - `Color.kt`: Define los colores utilizados en los temas claro y oscuro.
      - `Theme.kt`: Configura el tema de la aplicación con soporte para tema claro y oscuro, definiendo esquemas de colores personalizados.
      - `Typography.kt`: Define las configuraciones de tipografía utilizadas en la aplicación.
  
  - `App.kt`: Componente principal que gestiona el estado de la lista de mascotas y coordina la visualización del formulario de registro y la lista de mascotas.
  
  - `MainActivity.kt`: La actividad principal de la aplicación, que actúa como punto de entrada y carga el componente `App`.

### Funcionalidades clave:
- **Registro de mascotas**: A través de un formulario, se pueden agregar nuevas mascotas con sus datos y foto.
- **Visualización de la lista de mascotas**: Muestra las mascotas registradas con opción para eliminarlas.
- **Temas claros y oscuros personalizados**: La aplicación soporta tanto un tema claro como uno oscuro, que se ajustan según la configuración del sistema o manualmente.

## Instalación

Para ejecutar la aplicación, sigue estos pasos:

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu_usuario/RegistroMascotas.git
   ```

2. Abre el proyecto en Android Studio.

3. Asegúrate de tener el SDK de Android configurado correctamente.

4. Ejecuta la aplicación en un emulador o dispositivo físico.

