# ContainerCorner - Esquina Decorativa para Contenedores en Android

## Descripción breve
`ContainerCorner` es un componente Jetpack Compose que permite agregar una esquina decorativa a cualquier contenedor, ideal para personalizar tarjetas, paneles o elementos visuales en la interfaz.

## Características principales
- Esquina decorativa personalizable (color, tamaño, forma).
- Soporte para integración en cualquier composable.
- Personalización de posición y estilo.
- Facilita la creación de diseños visuales únicos.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
import com.invex.one.uikit.components.container.ContainerCorner

ContainerCorner(
    modifier = Modifier,
    color = Color.Blue
)
```

## Configuración y personalización
- `modifier`: Personalización de tamaño, posición, etc.
- `color`: Color de la esquina decorativa.
- Personalización de forma y estilo mediante temas.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

