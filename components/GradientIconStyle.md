# GradientIconStyle

Componente para aplicar estilos de gradiente a íconos, permitiendo personalización visual avanzada en la interfaz.

## Características principales
- Aplicación de gradientes a íconos vectoriales.
- Personalización de dirección y colores.
- Soporte para animaciones.
- Integración sencilla en cualquier ImageView o Drawable.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+

## Guía de uso
```kotlin
val gradientStyle = GradientIconStyle()
gradientStyle.applyTo(iconView, listOf(Color.CYAN, Color.MAGENTA))
```

## Configuración y personalización
- Cambia la dirección y los colores del gradiente:
```kotlin
gradientStyle.setDirection(GradientIconStyle.Direction.LEFT_TO_RIGHT)
gradientStyle.setColors(listOf(Color.YELLOW, Color.ORANGE))
```

## Dependencias
- implementation("androidx.core:core-ktx:1.12.0")

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

