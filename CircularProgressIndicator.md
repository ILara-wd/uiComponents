
## Configuración y personalización
- Ajusta el tamaño, color y grosor según tu diseño:
```kotlin
CircularProgressIndicator(progress = 0.5f, size = 64.dp, strokeWidth = 8.dp)
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
# CircularProgressIndicator

Indicador de progreso circular personalizado para Compose, ideal para mostrar estados de carga o avance.

## Características principales
- Visualización de progreso en forma de círculo.
- Personalización de tamaño, grosor y colores.
- Accesibilidad y test tags incluidos.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+
- Jetpack Compose

## Guía de uso
```kotlin
CircularProgressIndicator(
    progress = 0.75f, // 75% de progreso
    size = 48.dp,
    strokeWidth = 4.dp,
    trackColor = Color.LightGray,
    progressColor = Color.Blue
)
```

