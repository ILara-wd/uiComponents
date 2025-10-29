# BitmapCaptureBox - Contenedor de Captura de Bitmap para Android

## Descripción breve
`BitmapCaptureBox` es un componente Jetpack Compose que permite capturar el contenido visual de un composable como un objeto Bitmap. Es útil para compartir, guardar o procesar imágenes generadas dinámicamente en la interfaz.

## Características principales
- Captura el contenido de un composable como Bitmap.
- Callback para obtener el Bitmap generado.
- Personalización de tamaño y contenido.
- Integración sencilla en flujos de exportación, compartir o guardar imágenes.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
import com.invex.one.uikit.components.container.BitmapCaptureBox

BitmapCaptureBox(
    onBitmapCaptured = { bitmap -> /* Acción con el Bitmap */ },
    modifier = Modifier
) {
    // Contenido a capturar
    Text("Captura esta vista")
}
```

## Configuración y personalización
- `onBitmapCaptured`: Callback que recibe el Bitmap generado.
- `modifier`: Personalización de tamaño, padding, etc.
- `content`: Composable para el contenido a capturar.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

