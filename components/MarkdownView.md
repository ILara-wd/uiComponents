# MarkdownView - Visualizador de Markdown para Android

## Descripción breve
`MarkdownView` es un componente Jetpack Compose que permite renderizar y mostrar contenido Markdown enriquecido, incluyendo encabezados, listas, enlaces, bloques de código y texto estilizado. Es ideal para documentación técnica, tutoriales y vistas de contenido dinámico en aplicaciones móviles.

## Características principales
- Renderizado completo de sintaxis Markdown.
- Soporte para encabezados, listas, enlaces, bloques de código y texto enriquecido.
- Personalización de estilos, colores y tipografía.
- Integración sencilla en pantallas de documentación, tutoriales y herramientas técnicas.
- Soporte para temas claro y oscuro.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
import com.invex.one.uikit.components.developer.MarkdownView

val markdownText = """
# Título principal
Este es un texto de ejemplo.
- Elemento 1
- Elemento 2
[GitHub](https://github.com)
```kotlin
val x = 10
println(x)
```
"""

MarkdownView(
    markdown = markdownText,
    theme = MarkdownTheme.Dark
)
```

## Configuración y personalización
- `markdown`: Cadena de texto con el contenido Markdown a renderizar.
- `theme`: Tema visual (claro u oscuro).
- `modifier`: Personalización de tamaño, padding, etc.
- Personalización de colores y tipografía mediante temas.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

