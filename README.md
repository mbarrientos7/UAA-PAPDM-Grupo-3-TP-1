# RegistroMascotas

## Descripción

RegistroMascotas es una aplicación Android diseñada para permitir a los usuarios registrar y gestionar información sobre sus mascotas. La aplicación ofrece una interfaz intuitiva y moderna, utilizando Jetpack Compose para la construcción de la UI, y Glide para la carga de imágenes desde URLs. Los usuarios pueden agregar nuevas mascotas, visualizar una lista de mascotas registradas y eliminar registros cuando sea necesario.

## Funcionalidades

### Carga en Tema Claro
La aplicación soporta un tema claro que proporciona una experiencia visual amigable y accesible.

[Ver demostración](https://github.com/user-attachments/assets/56f5a8f1-e211-4c45-8b14-8cb48b3c2abd)

### Carga en Tema Oscuro
La aplicación también ofrece un tema oscuro, ideal para entornos con poca luz, mejorando la legibilidad y reduciendo la fatiga visual.

[Ver demostración](https://github.com/user-attachments/assets/5d90a3d2-d5a8-42a0-a03d-600201ebb832)

### Eliminación de Registros
Los usuarios pueden eliminar registros de mascotas de manera sencilla, asegurando que la lista de mascotas siempre esté actualizada.

[Ver demostración](https://github.com/user-attachments/assets/91b4ffe4-78e9-4837-bb5d-eb1c4b66e6af)

### Prevención de URL Inválida
La aplicación incluye validaciones para asegurar que las URLs de las fotos de las mascotas sean válidas, evitando errores en la carga de imágenes.

[Ver demostración](https://github.com/user-attachments/assets/febed93b-bf82-4331-9ff8-69b1d92a3336)

## Tecnologías Utilizadas

- **Lenguaje de Programación**: Kotlin
- **Framework**: Jetpack Compose
- **Gestión de Dependencias**: Gradle
- **Carga de Imágenes**: Glide
- **Pruebas**: JUnit, Espresso

## Estructura del Proyecto

El proyecto está organizado en varias carpetas clave:

- `app/src/main/java/com/registromascotas`: Contiene el código fuente de la aplicación.
- `app/src/main/res`: Contiene los recursos de la aplicación, como layouts, strings y temas.
- `app/src/main/AndroidManifest.xml`: Archivo de manifiesto que define la configuración de la aplicación.
- `app/build.gradle.kts`: Archivo de configuración de Gradle para la aplicación.

## Instalación

Para ejecutar la aplicación, sigue estos pasos:

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu_usuario/RegistroMascotas.git
   ```

2. Abre el proyecto en Android Studio.

3. Asegúrate de tener el SDK de Android configurado correctamente.

4. Ejecuta la aplicación en un emulador o dispositivo físico.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir, por favor sigue estos pasos:

1. Haz un fork del proyecto.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commit (`git commit -m 'Agregada nueva funcionalidad'`).
4. Haz push a la rama (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

## Notas Adicionales

- **Requisitos del Sistema**: Asegúrate de que tu dispositivo o emulador tenga al menos Android 7.0 (API 24) para ejecutar la aplicación.
