# FloatingDialog

Componente de diálogo flotante para mostrar información o acciones rápidas sin interrumpir el flujo principal de la aplicación.

## Características principales
- Diálogo flotante con animaciones.
- Personalización de posición y tamaño.
- Soporte para acciones rápidas y botones.
- Integración con cualquier Activity o Fragment.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+

## Guía de uso
```kotlin
val floatingDialog = FloatingDialog(context)
floatingDialog.show("Información", "Este es un diálogo flotante.")
```

## Configuración y personalización
- Modifica la posición y el contenido:
```kotlin
floatingDialog.setPosition(FloatingDialog.Position.BOTTOM)
floatingDialog.setContent("Nuevo contenido")
```

## Dependencias
- implementation("androidx.core:core-ktx:1.12.0")

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

