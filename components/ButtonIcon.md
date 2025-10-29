# ButtonIcon - Botón con Ícono para Android

## Descripción breve
`ButtonIcon` es un componente Jetpack Compose que representa un botón con ícono, ideal para acciones rápidas y accesibles en interfaces móviles. Permite personalizar el ícono, color, tamaño y acción al hacer clic.

## Características principales
- Botón con ícono personalizable.
- Soporte para diferentes tamaños y colores.
- Acción personalizada al hacer clic.
- Integración sencilla en barras de herramientas, listas y formularios.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
import com.invex.one.uikit.components.buttons.ButtonIcon
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.invex.one.uikit.R

ButtonIcon(
    icon = ImageVector.vectorResource(R.drawable.ic_add),
    contentDescription = "Agregar",
    onClick = { /* Acción al hacer clic */ }
)
```

## Configuración y personalización
- `icon`: Ícono vectorial mostrado en el botón.
- `contentDescription`: Descripción para accesibilidad.
- `onClick`: Acción al presionar el botón.
- `modifier`: Personalización de tamaño, padding, etc.
- `tint`: Color del ícono.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

