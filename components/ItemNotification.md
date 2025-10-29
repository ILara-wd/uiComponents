# ItemNotification

Componente Compose para mostrar ítems de notificación con título, descripción, categoría y estado de lectura.

## Características principales
- Visualización de notificaciones agrupadas por sección.
- Soporte para swipe-to-delete y skeleton loading.
- Personalización de estilos y colores.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+
- Jetpack Compose

## Guía de uso
```kotlin
ItemNotification(
    notification = NotificationItem(
        title = "Compra exitosa",
        description = "Tu compra fue procesada",
        timestamp = "09:34 h",
        category = "Compra",
        isRead = false
    ),
    onClick = { /* Acción al hacer clic */ }
)
```

## Configuración y personalización
- Personaliza el color, el estado de lectura y la categoría:
```kotlin
NotificationItem(title = "Transferencia", description = "Recibida", timestamp = "08:45 h", category = "Transferencia", isRead = true)
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

