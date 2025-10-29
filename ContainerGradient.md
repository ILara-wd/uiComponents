# ContainerGradient - Contenedor con Fondo Degradado para Android

## Descripción breve
`ContainerGradient` es un componente Jetpack Compose que permite mostrar un contenedor con fondo degradado, ideal para resaltar secciones, tarjetas o elementos visuales en la interfaz.

## Características principales
- Fondo degradado personalizable (colores, dirección, tipo).
- Soporte para cualquier contenido composable.
- Personalización de tamaño, padding y estilo.
- Integración sencilla en tarjetas, listas y pantallas principales.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
import com.invex.one.uikit.components.container.ContainerGradient
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

ContainerGradient(
    brush = Brush.horizontalGradient(listOf(Color.Blue, Color.Cyan)),
    modifier = Modifier
) {
    // Contenido del contenedor
    Text("Sección destacada")
}
```

## Configuración y personalización
- `brush`: Configuración del degradado (colores, dirección, tipo).
- `modifier`: Personalización de tamaño, padding, etc.
- `content`: Composable para el contenido principal del contenedor.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

