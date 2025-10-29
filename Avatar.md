# Avatar

Componente para mostrar avatares de usuario con soporte para imágenes, iniciales y estilos personalizados.

## Características principales
- Visualización de imagen o iniciales.
- Personalización de bordes, fondo y tamaño.
- Soporte para estados (online/offline).
- Integración sencilla en perfiles y listas.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+

## Guía de uso
```kotlin
val avatar = Avatar(context)
avatar.setImageUrl("https://ejemplo.com/avatar.png")
avatar.setInitials("IL")
avatar.setStatus(Avatar.Status.ONLINE)
```

## Configuración y personalización
- Cambia el color de fondo y el borde:
```kotlin
avatar.setBackgroundColor(Color.BLUE)
avatar.setBorderColor(Color.WHITE)
```

## Dependencias
- implementation("androidx.core:core-ktx:1.12.0")

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

