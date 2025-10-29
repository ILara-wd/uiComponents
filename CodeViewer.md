# CodeViewer - Visualizador de Código para Android

## Descripción breve
`CodeViewer` es un componente Jetpack Compose que permite mostrar bloques de código fuente con resaltado de sintaxis, numeración de líneas y soporte para temas claros y oscuros. Es ideal para aplicaciones de desarrollo, documentación técnica o herramientas educativas.

## Características principales
- Visualización de código fuente con resaltado de sintaxis.
- Numeración de líneas opcional.
- Soporte para temas claro y oscuro.
- Personalización de colores, fuente y tamaño.
- Integración sencilla en pantallas de documentación, tutoriales o herramientas de desarrollo.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
import com.invex.one.uikit.components.developer.CodeViewer

val code = """
fun main() {
    println("Hola, mundo!")
}
"""

CodeViewer(
    code = code,
    language = "kotlin",
    showLineNumbers = true,
    theme = CodeViewerTheme.Dark
)
```

## Configuración y personalización
- `code`: Cadena de texto con el código fuente a mostrar.
- `language`: Lenguaje de programación para el resaltado de sintaxis.
- `showLineNumbers`: Mostrar u ocultar numeración de líneas.
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

