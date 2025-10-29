# BadgedContainer - Contenedor con Insignia para Android

## Descripción breve
`BadgedContainer` es un componente Jetpack Compose que permite mostrar un contenedor con una insignia (badge) superpuesta, ideal para resaltar notificaciones, estados o cantidades en tarjetas y listas.

## Características principales
- Contenedor personalizable con insignia superpuesta.
- Soporte para badge numérico, de estado o texto.
- Personalización de colores, tamaño y posición de la insignia.
- Integración sencilla en tarjetas, listas y menús.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
import com.invex.one.uikit.components.container.BadgedContainer

BadgedContainer(
    badgeCount = 3,
    modifier = Modifier,
) {
    // Contenido del contenedor
    Text("Mensajes")
}
```

## Configuración y personalización
- `badgeCount`: Número a mostrar en la insignia.
- `badgeColor`: Color de la insignia.
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

