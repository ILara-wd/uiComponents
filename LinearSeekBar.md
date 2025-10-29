# LinearSeekBar

Componente para mostrar un seekbar lineal con marcas (ticks) y etiquetas personalizadas, ideal para selección de valores en Android con Jetpack Compose.

## Características principales
- Barra de progreso horizontal con marcas y etiquetas.
- Personalización de valores, etiquetas y estilos.
- Soporte para mostrar fecha de última actualización.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+
- Jetpack Compose

## Guía de uso
```kotlin
val tickValues = listOf(0f, 25000f, 50000f, 75000f)
val tickLabels = listOf("$", "25K", "50K", "75K")
val current = remember { mutableFloatStateOf(25000f) }
LinearSeekBar(
    linearSeekBarConfig = LinearSeekBarConfig(
        minValue = tickValues.first(),
        maxValue = tickValues.last(),
        tickValues = tickValues,
        labels = tickLabels,
        currentValue = current.floatValue,
        onValueChange = { current.floatValue = it },
        lastUpdate = LocalDate.of(2024, 3, 30)
    )
)
```

## Configuración y personalización
- Modifica los valores, etiquetas y estilos visuales:
```kotlin
LinearSeekBar(
    linearSeekBarConfig = LinearSeekBarConfig(
        minValue = 0f,
        maxValue = 100f,
        tickValues = listOf(0f, 50f, 100f),
        labels = listOf("Min", "Medio", "Max"),
        currentValue = 50f,
        onValueChange = { /* ... */ }
    ),
    trackHeight = 12.dp
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

