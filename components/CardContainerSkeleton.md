# CardContainerSkeleton

Contenedor de tarjeta esquelética para Compose, ideal para mostrar placeholders de carga con estilos personalizables.

## Características principales
- Contenedor con esquinas redondeadas y fondo personalizable.
- Soporte para contenido esquelético flexible.
- Integración sencilla en layouts Compose.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+
- Jetpack Compose

## Guía de uso
```kotlin
CardContainerSkeleton {
    SkeletonLine(fraction = 0.8f, shape = CircleShape)
}
```

## Configuración y personalización
- Modifica el padding, color y contenido usando el parámetro `modifier` y el bloque `content`.

## Dependencias
- implementation("androidx.compose.ui:ui:1.2.0")

## Instalación
1. Agrega la dependencia en tu archivo build.gradle.kts.
2. Importa el componente y úsalo en tu UI Compose.

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

