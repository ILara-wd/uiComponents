# GradientCircleWithIcon

Componente para mostrar un ícono dentro de un círculo con fondo de gradiente, ideal para destacar acciones o estados.

## Características principales
- Fondo circular con gradiente personalizado.
- Ícono central configurable.
- Animaciones de entrada.
- Fácil integración en layouts y botones.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+

## Guía de uso
```kotlin
val gradientCircle = GradientCircleWithIcon(context)
gradientCircle.setIcon(R.drawable.ic_check)
gradientCircle.setGradientColors(listOf(Color.GREEN, Color.BLUE))
```

## Configuración y personalización
- Modifica el tamaño y los colores del gradiente:
```kotlin
gradientCircle.setSize(48)
gradientCircle.setGradientColors(listOf(Color.RED, Color.YELLOW))
```

## Dependencias
- implementation("androidx.core:core-ktx:1.12.0")

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

