# HighlightCode - Resaltador de Código para Android

## Descripción breve
`HighlightCode` es un componente Jetpack Compose que permite resaltar sintaxis de código fuente en diferentes lenguajes, facilitando la visualización y comprensión en aplicaciones de desarrollo, documentación o educación técnica.

## Características principales
- Resaltado de sintaxis para múltiples lenguajes de programación.
- Personalización de colores, fuente y tamaño.
- Integración sencilla en visualizadores de código y tutoriales.
- Soporte para temas claro y oscuro.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
import com.invex.one.uikit.components.developer.HighlightCode

val code = """
val x = 10
println(x)
"""

HighlightCode(
    code = code,
    language = "kotlin",
    theme = HighlightTheme.Light
)
```

## Configuración y personalización
- `code`: Cadena de texto con el código fuente a resaltar.
- `language`: Lenguaje de programación para el resaltado.
- `theme`: Tema visual (claro u oscuro).
- `modifier`: Personalización de tamaño, padding, etc.
- Personalización de colores y fuente mediante temas.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

