# BadgedIcon - Ícono con Insignia para Android

## Descripción breve
`BadgedIcon` es un componente Jetpack Compose que muestra un ícono con una insignia (badge) superpuesta, ideal para notificaciones, mensajes no leídos o estados especiales en la interfaz.

## Características principales
- Ícono vectorial con insignia numérica o de estado.
- Personalización de color, tamaño y posición de la insignia.
- Soporte para diferentes estilos de badge (número, punto, texto).
- Integración sencilla en barras de herramientas, menús y listas.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
import com.invex.one.uikit.components.buttons.BadgedIcon
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.invex.one.uikit.R

BadgedIcon(
    icon = ImageVector.vectorResource(R.drawable.ic_notifications),
    badgeCount = 5,
    contentDescription = "Notificaciones"
)
```

## Configuración y personalización
- `icon`: Ícono vectorial mostrado en el botón.
- `badgeCount`: Número a mostrar en la insignia.
- `badgeColor`: Color de la insignia.
- `contentDescription`: Descripción para accesibilidad.
- `modifier`: Personalización de tamaño, padding, etc.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

