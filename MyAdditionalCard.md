# MyAdditionalCard - Tarjeta de Adicionales para Android

## Descripción breve
`MyAdditionalCard` es un componente de Jetpack Compose que muestra una tarjeta con una lista horizontal de elementos adicionales. Si la lista está vacía, presenta un mensaje y un botón para solicitar un nuevo adicional.

## Características principales
- Presenta una lista horizontal de elementos adicionales.
- Muestra mensaje y botón de solicitud si no hay elementos.
- Personalización de título, mensajes y acciones.
- Integración sencilla con Jetpack Compose.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso

```kotlin
import com.invex.one.uikit.components.additional.MyAdditionalCard
import com.invex.one.uikit.components.additional.MyAdditionalCardItem

MyAdditionalCard(
    items = listOf(
        MyAdditionalCardItem(
            icon = R.drawable.ic_manchester,
            title = "Nombre",
            detailMessage = "1234567890"
        )
    ),
    onClickItemAdditional = { item -> /* Acción al seleccionar */ },
    onClickRequestedAdditional = { /* Acción al solicitar nuevo adicional */ }
)
```

## Configuración y personalización
- `items`: Lista de objetos `MyAdditionalCardItem`.
- `onClickItemAdditional`: Acción al seleccionar un elemento.
- `onClickRequestedAdditional`: Acción al solicitar nuevo adicional.
- `title`: Título de la tarjeta.
- `noFoundMessage`: Mensaje si no hay elementos.
- `requestMessage`: Texto del botón de solicitud.
- `modifier`: Modificador Compose para tamaño, padding, etc.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

