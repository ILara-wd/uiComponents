# CreditHtmlText

Componente: Renderizado de texto HTML enriquecido para interfaces financieras en Android.

## Descripción breve
`CreditHtmlText` permite mostrar texto con formato HTML, soportando estilos como negrita, cursiva y colores, ideal para mensajes informativos o legales en flujos de crédito.

## Características principales
- Renderizado de HTML con estilos (negrita, cursiva, color).
- Soporte para alineación y tamaño de fuente.
- Fácil integración en layouts Compose.
- Personalización de estilo y alineación.

## Requisitos de instalación
- Android Studio Electric Eel o superior
- Kotlin 1.8+
- Jetpack Compose 1.4.0+
- Módulo `uikit` incluido en el proyecto

## Guía de uso
```kotlin
import com.invex.one.uikit.components.text.CreditHtmlText

@Composable
fun ExampleCreditHtmlText() {
    CreditHtmlText(
        text = "<b>Texto en negrita</b> y <i>cursiva</i>",
        fontSize = 16.sp,
        textAlign = TextAlign.Center
    )
}
```

## Configuración y personalización
- **text**: Texto en formato HTML.
- **fontSize**: Tamaño de fuente.
- **textAlign**: Alineación del texto.
- **modifier**: Permite ajustar el diseño externo.

Ejemplo de personalización:
```kotlin
CreditHtmlText(
    text = "<span style='color:#FF0000'>Texto rojo</span>",
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

