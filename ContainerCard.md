# ContainerCard - Tarjeta de Contenedor para Android

## Descripción breve
`ContainerCard` es un componente Jetpack Compose que permite mostrar contenido dentro de una tarjeta con estilos personalizables, ideal para agrupar información, acciones o elementos visuales en la interfaz.

## Características principales
- Tarjeta con sombra, bordes y fondo personalizables.
- Soporte para cualquier contenido composable.
- Personalización de tamaño, padding y estilo.
- Integración sencilla en listas, dashboards y pantallas de detalle.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
import com.invex.one.uikit.components.container.ContainerCard

ContainerCard(
    modifier = Modifier,
) {
    // Contenido de la tarjeta
    Text("Información relevante")
}
```

## Configuración y personalización
- `modifier`: Personalización de tamaño, padding, sombra, etc.
- `content`: Composable para el contenido principal de la tarjeta.
- Personalización de colores y bordes mediante temas.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

