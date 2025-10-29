# CustomLinearProgress

Barra de progreso lineal personalizada para Compose, ideal para mostrar avances en procesos o tareas.

## Características principales
- Barra horizontal con progreso animado.
- Personalización de colores, altura y estilos.
- Fácil integración en cualquier layout Compose.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+
- Jetpack Compose

## Guía de uso
```kotlin
CustomLinearProgress(
    progress = 0.5f, // 50% de progreso
    trackHeight = 4.dp,
    trackColor = Color.Gray,
    progressColor = Color.Green
)
```

## Configuración y personalización
- Modifica el color, altura y estilo:
```kotlin
CustomLinearProgress(progress = 0.8f, trackHeight = 8.dp, progressColor = Color.Red)
```

## Dependencias
- implementation("androidx.compose.ui:ui:1.2.0")

## Instalación
1. Agrega la dependencia en tu build.gradle.kts.
2. Usa el componente en tu UI Compose.

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

