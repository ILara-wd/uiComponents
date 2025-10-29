# ToggleVisibilityIcon - Ícono de Alternancia de Visibilidad para Android

## Descripción breve
`ToggleVisibilityIcon` es un componente Jetpack Compose que representa un ícono interactivo para alternar la visibilidad de contenido, como mostrar u ocultar contraseñas. Cambia el estado de visibilidad y actualiza el ícono mostrado al hacer clic.

## Características principales
- Alterna entre dos íconos (visible/oculto) según el estado.
- Callback para manejar el cambio de visibilidad.
- Personalización de color, íconos y tamaño.
- Integración sencilla en campos de texto y formularios.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso

```kotlin
import com.invex.one.uikit.components.bar.ToggleVisibilityIcon
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.invex.one.uikit.R

var isPasswordVisible by remember { mutableStateOf(false) }

ToggleVisibilityIcon(
    isVisible = isPasswordVisible,
    onVisibilityChanged = { isPasswordVisible = it },
    visibleIcon = ImageVector.vectorResource(id = R.drawable.ic_eye),
    hiddenIcon = ImageVector.vectorResource(id = R.drawable.ic_close_eye)
)
```

## Configuración y personalización
- `isVisible`: Estado actual de visibilidad.
- `onVisibilityChanged`: Callback para manejar el cambio de estado.
- `visibleIcon`: Ícono para estado visible.
- `hiddenIcon`: Ícono para estado oculto.
- `tint`: Color del ícono.
- `modifier`: Modificador Compose para tamaño, padding, etc.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

