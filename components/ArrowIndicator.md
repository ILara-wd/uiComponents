# ArrowIndicator - Indicador de Flecha para Android

## Descripción breve
`ArrowIndicator` es un componente de Jetpack Compose que muestra una flecha animada, ideal para indicar progreso o estados de actualización en interfaces móviles. Permite animaciones de rotación y personalización de color, tamaño y semántica de accesibilidad.

## Características principales
- Animación de rotación infinita durante estados de refresco.
- Visualización de progreso mediante ángulos y opacidad.
- Personalización de color y tamaño.
- Semántica de accesibilidad para lectores de pantalla.
- Fácil integración en cualquier jerarquía Compose.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso

```kotlin
import com.invex.one.uikit.components.bar.ArrowIndicator
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier

ArrowIndicator(
    progress = { 0.75f }, // Progreso entre 0.0 y 1.0
    isRefreshing = true,  // Estado de refresco
    color = Color.Blue,   // Color de la flecha
    modifier = Modifier   // Modificador Compose
)
```

## Configuración y personalización
- `progress`: Función que retorna el valor de progreso (0.0 a 1.0).
- `isRefreshing`: Booleano para activar animación de rotación.
- `color`: Color de la flecha.
- `modifier`: Modificador Compose para tamaño, padding, etc.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

