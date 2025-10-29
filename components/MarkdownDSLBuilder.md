# MarkdownDSLBuilder - Constructor DSL de Markdown para Android

## Descripción breve
`MarkdownDSLBuilder` es una utilidad Jetpack Compose que permite construir documentos Markdown de forma declarativa y programática usando una DSL (Domain Specific Language). Facilita la generación dinámica de contenido técnico, documentación y vistas enriquecidas en aplicaciones móviles.

## Características principales
- Construcción declarativa de documentos Markdown.
- Soporte para encabezados, listas, enlaces, bloques de código y texto enriquecido.
- Integración sencilla con componentes de visualización Markdown.
- Personalización de estilos y estructura.
- Facilita la generación dinámica de documentación y tutoriales.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
import com.invex.one.uikit.components.developer.MarkdownDSLBuilder

val markdown = MarkdownDSLBuilder.build {
    heading("Título principal")
    text("Este es un texto de ejemplo.")
    codeBlock("val x = 10\nprintln(x)", language = "kotlin")
    link("GitHub", url = "https://github.com")
    list {
        item("Elemento 1")
        item("Elemento 2")
    }
}
```

## Configuración y personalización
- Métodos DSL para encabezados, texto, listas, enlaces y bloques de código.
- Personalización de estructura y estilos mediante la DSL.
- Integración con componentes de visualización Markdown.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

