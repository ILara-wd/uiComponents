# ErrorDialog

Componente de diálogo para mostrar mensajes de error claros y consistentes en aplicaciones Android, facilitando la comunicación de fallos al usuario.

## Características principales
- Diálogo modal con título, mensaje y botón de acción.
- Personalización de icono y colores.
- Soporte para acciones personalizadas en el botón.
- Integración sencilla con ViewModels.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+

## Guía de uso
```kotlin
val errorDialog = ErrorDialog(context)
errorDialog.show("Error", "Ha ocurrido un problema.")
```

## Configuración y personalización
- Cambia el icono y el texto del botón:
```kotlin
errorDialog.setIcon(R.drawable.ic_error)
errorDialog.setButtonText("Reintentar")
```

## Dependencias
- implementation("androidx.appcompat:appcompat:1.6.1")

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

