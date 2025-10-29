# ContainerToast

Componente para mostrar mensajes tipo toast personalizados dentro de un contenedor específico de la interfaz, permitiendo mayor control visual y de interacción.

## Características principales
- Mensajes toast con estilos personalizados.
- Posicionamiento configurable dentro del contenedor.
- Soporte para múltiples mensajes simultáneos.
- Animaciones de aparición y desaparición.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+

## Guía de uso
```kotlin
ContainerToast.show(containerView, "Operación exitosa")
```

## Configuración y personalización
- Personaliza el fondo, duración y estilo:
```kotlin
ContainerToast.setBackground(Color.GREEN)
ContainerToast.setDuration(Toast.LENGTH_LONG)
```

## Dependencias
- implementation("androidx.core:core-ktx:1.12.0")

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

