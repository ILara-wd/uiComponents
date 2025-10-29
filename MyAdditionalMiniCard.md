# MyAdditionalMiniCard - Tarjeta Mini de Adicional para Android

## Descripción breve
`MyAdditionalMiniCard` es un componente de Jetpack Compose que muestra una tarjeta compacta para representar un elemento adicional. Permite mostrar información resumida y una opción para solicitar un nuevo adicional si no se proporciona un elemento.

## Características principales
- Presenta información resumida de un adicional (icono, título, detalle).
- Muestra opción para solicitar nuevo adicional si el elemento es nulo.
- Personalización de colores, estilos y acciones.
- Integración sencilla con Jetpack Compose.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso

```kotlin
import com.invex.one.uikit.components.additional.MyAdditionalMiniCard
import com.invex.one.uikit.components.additional.MyAdditionalCardItem

MyAdditionalMiniCard(
    myAdditionalCardItem = MyAdditionalCardItem(
        icon = R.drawable.ic_manchester,
        title = "Nombre",
        detailMessage = "1234567890"
    ),
    onclick = { item -> /* Acción al seleccionar */ }
)

// Para mostrar la opción de nuevo adicional:
MyAdditionalMiniCard(
    myAdditionalCardItem = null,
    onclick = { /* Acción al solicitar nuevo adicional */ }
)
```

## Configuración y personalización
- `myAdditionalCardItem`: Elemento adicional a mostrar (o null para nuevo).
- `onclick`: Acción al seleccionar la tarjeta.
- `modifier`: Modificador Compose para tamaño, padding, etc.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

