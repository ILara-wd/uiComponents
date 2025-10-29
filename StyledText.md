# StyledText - Componente de Texto Estilizado para Android

## Descripción

`StyledText` es un componente de Jetpack Compose que permite mostrar texto con estilos personalizados (negrita, itálica, subrayado y tachado) usando delimitadores simples en la cadena de texto. Facilita la presentación de información enriquecida sin manipular manualmente los estilos.

## Características principales

- Soporte para negrita, itálica, subrayado y tachado mediante delimitadores.
- Personalización de color, alineación y fuente.
- Fácil integración en proyectos Compose.
- Ejemplo de vista previa incluido.

## Requisitos

- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Instalación

1. Incluye el módulo en tu archivo `settings.gradle`:
    ```groovy
    include ':uikit'
    ```
2. Agrega la dependencia en tu `build.gradle`:
    ```groovy
    implementation project(":uikit")
    ```

## Guía de uso

### Uso básico

```kotlin
import com.invex.one.uikit.components.label.StyledText

StyledText(
    text = "Texto °negrita°, ¬itálica¬, _subrayado_, -tachado-",
    textAlign = TextAlign.Center,
    color = Color.Black
)
```

### Ejemplo completo

```kotlin
Column {
    StyledText(text = "Texto sin estilos")
    StyledText(text = "Texto °negrita°")
    StyledText(text = "Texto ¬itálica¬")
    StyledText(text = "Texto _subrayado_")
    StyledText(text = "Texto -tachado-")
}
```

## Configuración y personalización

- `text`: Cadena con delimitadores para estilos.
- `textAlign`: Alineación (`TextAlign.Left`, `TextAlign.Center`, etc.).
- `color`: Color del texto (`Color.Black`, `Color.Red`, etc.).
- `modifier`: Modificador Compose para tamaño, padding, etc.

## Capturas de pantalla

_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias

- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia

Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

