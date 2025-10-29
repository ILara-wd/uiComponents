# ResponsiveText

Componente: Etiqueta de texto responsiva que ajusta el tamaño de fuente según el espacio y longitud del texto en Android.

## Descripción breve
`ResponsiveText` permite mostrar texto que se adapta automáticamente al espacio disponible y a la cantidad de caracteres, asegurando legibilidad y estética en diferentes dispositivos y resoluciones.

## Características principales
- Ajuste automático del tamaño de fuente según longitud y límites configurados.
- Soporte para límites de caracteres y líneas.
- Personalización de estilo, color y tamaño fijo.
- Fácil integración en layouts Compose.

## Requisitos de instalación
- Android Studio Electric Eel o superior
- Kotlin 1.8+
- Jetpack Compose 1.4.0+
- Módulo `uikit` incluido en el proyecto

## Guía de uso
```kotlin
import com.invex.one.uikit.components.text.ResponsiveText
import com.invex.one.uikit.components.text.ConfigLimits

@Composable
fun ExampleResponsiveText() {
    ResponsiveText(
        text = "Texto adaptable",
        configLimits = ConfigLimits(minChars = 3, maxChars = 20)
    )
}
```

## Configuración y personalización
- **text**: Texto a mostrar.
- **configLimits**: Configuración de límites de caracteres y líneas.
- **style**: Estilo de texto base.
- **color**: Color del texto.
- **fontSize**: Tamaño de fuente fijo (opcional).
- **modifier**: Permite ajustar el diseño externo.

Ejemplo de personalización:
```kotlin
ResponsiveText(
    text = "Mensaje largo",
    configLimits = ConfigLimits(minChars = 10, maxChars = 50, minLines = 2, maxLines = 3),
    fontSize = 18.sp,
    color = Color.Blue
)
```

## Capturas de pantalla
*No aplica en este archivo, pero se recomienda agregar imágenes en la documentación principal del proyecto si es necesario.*

## Dependencias
- Jetpack Compose
- `uikit` (propio del proyecto)

## Licencia
Este componente se distribuye bajo la licencia MIT.

## Autor
- Irving Lara
- 24 de septiembre del 2025

