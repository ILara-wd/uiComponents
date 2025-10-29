# CustomVerticalScrollBar

Componente para crear una barra de desplazamiento vertical personalizada junto con una lista de elementos en Jetpack Compose.

## Características principales
- Barra de desplazamiento visual personalizada.
- Integración con listas verticales.
- Personalización de color, ancho y radio de esquinas.
- Soporte para interacción y scroll programático.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+
- Jetpack Compose

## Guía de uso
```kotlin
val items: List<@Composable () -> Unit> = ...
CustomVerticalScrollBar(
    scrollBarColor = Color.Magenta,
    scrollBarWidth = 8.dp,
    cornerRadius = 4.dp,
    items = items
)
```

## Configuración y personalización
- Modifica el color, ancho y radio de la barra:
```kotlin
CustomVerticalScrollBar(
    scrollBarColor = Color.Blue,
    scrollBarWidth = 12.dp,
    cornerRadius = 8.dp,
    items = items
)
```

## Dependencias
- implementation("androidx.compose.material3:material3:1.2.0")

## Instalación
1. Agrega la dependencia en tu archivo build.gradle.kts.
2. Importa el componente y úsalo en tu UI Compose.

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

