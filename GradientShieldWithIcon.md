# GradientShieldWithIcon

Componente para mostrar un escudo con fondo de gradiente e ícono central, ideal para representar seguridad o protección.

## Características principales
- Fondo de escudo con gradiente personalizado.
- Ícono central configurable.
- Personalización de tamaño y colores.
- Animaciones de entrada.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+

## Guía de uso
```kotlin
val shield = GradientShieldWithIcon(context)
shield.setIcon(R.drawable.ic_shield)
shield.setGradientColors(listOf(Color.GREEN, Color.BLUE))
```

## Configuración y personalización
- Modifica el tamaño y los colores del gradiente:
```kotlin
shield.setSize(64)
shield.setGradientColors(listOf(Color.RED, Color.YELLOW))
```

## Dependencias
- implementation("androidx.core:core-ktx:1.12.0")

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

