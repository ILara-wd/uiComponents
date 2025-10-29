# SecondaryButton - Botón Secundario para Android

## Descripción breve
`SecondaryButton` es un componente Jetpack Compose que representa un botón de acción secundaria en la interfaz, siguiendo el estilo de la marca. Es ideal para acciones complementarias como omitir, volver o cancelar.

## Características principales
- Estilo visual diferenciado para acciones secundarias.
- Soporte para estados habilitado/deshabilitado y cargando.
- Personalización de texto, color, tamaño y bordes.
- Integración sencilla en formularios y pantallas secundarias.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
import com.invex.one.uikit.components.buttons.SecondaryButton

SecondaryButton(
    text = "Omitir",
    onClick = { /* Acción secundaria */ },
    enabled = true,
    loading = false
)
```

## Configuración y personalización
- `text`: Texto del botón.
- `onClick`: Acción al presionar el botón.
- `enabled`: Estado habilitado/deshabilitado.
- `loading`: Estado de carga (spinner).
- `modifier`: Personalización de tamaño, padding, etc.
- Personalización de colores y bordes mediante temas.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

