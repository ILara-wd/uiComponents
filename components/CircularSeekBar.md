# CircularSeekBar

Componente para mostrar el progreso en forma circular con un ícono central, ideal para indicadores visuales en Android con Jetpack Compose.

## Características principales
- Indicador de progreso circular animado.
- Ícono central personalizable.
- Personalización de tamaño, color y grosor.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+
- Jetpack Compose

## Guía de uso
```kotlin
CircularSeekBar(
    progress = 0.75f, // 75% de progreso
    size = 180.dp,
    strokeWidth = 16.dp
)
```

## Configuración y personalización
- Modifica el ícono, color y tamaño:
```kotlin
CircularSeekBar(
    progress = 0.5f,
    size = 120.dp,
    strokeWidth = 8.dp
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

