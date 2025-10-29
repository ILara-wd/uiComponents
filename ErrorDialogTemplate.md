# ErrorDialogTemplate

Plantilla base para la creación de diálogos de error personalizados, permitiendo reutilización y consistencia en la presentación de errores.

## Características principales
- Estructura base para diálogos de error.
- Permite heredar y extender funcionalidades.
- Personalización de layout y estilos.
- Integración con flujos de error en ViewModels.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+

## Guía de uso
```kotlin
class CustomErrorDialog(context: Context) : ErrorDialogTemplate(context) {
    // Personaliza el layout y comportamiento
}
```

## Configuración y personalización
- Extiende la clase y sobreescribe métodos para adaptar el diseño:
```kotlin
override fun setupDialog() {
    // Configura iconos, colores y acciones
}
```

## Dependencias
- implementation("androidx.appcompat:appcompat:1.6.1")

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

