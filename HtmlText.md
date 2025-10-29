# HtmlText

Componente: Renderizado de texto HTML enriquecido con soporte para enlaces y estilos en Android.

## Descripción breve
`HtmlText` permite mostrar texto con formato HTML, incluyendo enlaces interactivos, estilos como negrita, cursiva y colores, ideal para mensajes informativos, legales o con interacción.

## Características principales
- Renderizado de HTML con estilos (negrita, cursiva, color, enlaces).
- Soporte para acción al hacer clic en enlaces.
- Personalización de tamaño de fuente y alineación.
- Fácil integración en layouts Compose.

## Requisitos de instalación
- Android Studio Electric Eel o superior
- Kotlin 1.8+
- Jetpack Compose 1.4.0+
- Módulo `uikit` incluido en el proyecto

## Guía de uso
```kotlin
import com.invex.one.uikit.components.text.HtmlText

@Composable
fun ExampleHtmlText() {
    HtmlText(
        text = "<a href='https://invex.com'>Invex</a> <b>negrita</b>",
        action = { /* Acción al hacer clic en enlace */ },
        fontSize = 16.sp,
        textAlign = TextAlign.Center
    )
}
```

## Configuración y personalización
- **text**: Texto en formato HTML.
- **action**: Acción a ejecutar al hacer clic en un enlace.
- **fontSize**: Tamaño de fuente.
- **textAlign**: Alineación del texto.
- **modifier**: Permite ajustar el diseño externo.

Ejemplo de personalización:
```kotlin
HtmlText(
    text = "<span style='color:#00FF00'>Texto verde</span>",
    fontSize = 18.sp,
    textAlign = TextAlign.Start
)
```

## Capturas de pantalla
*No aplica en este archivo, pero se recomienda agregar imágenes en la documentación principal del proyecto si es necesario.*

## Dependencias
- Jetpack Compose
- `uikit` (propio del proyecto)
- androidx.core.text.HtmlCompat

## Licencia
Este componente se distribuye bajo la licencia MIT.

## Autor
- Irving Lara
- 24 de septiembre del 2025

