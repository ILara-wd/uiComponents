# Stepper

Componente: Barra de progreso por pasos para flujos secuenciales en Android.

## Descripción breve
`Stepper` es un componente visual que guía al usuario a través de un proceso dividido en pasos, mostrando el estado de cada uno (activo, completado, pendiente) y permitiendo interacción.

## Características principales
- Visualización de múltiples pasos con estados (activo, completado, pendiente).
- Personalización de colores, íconos y textos.
- Soporte para textos superiores e inferiores en cada paso.
- Callback para manejar la selección de pasos.

## Requisitos de instalación
- Android Studio Electric Eel o superior
- Kotlin 1.8+
- Jetpack Compose 1.4.0+
- Módulo `uikit` incluido en el proyecto

## Guía de uso
```kotlin
import com.invex.one.uikit.components.stepper.Stepper
import com.invex.one.uikit.components.stepper.Step

val steps = listOf(
    Step(id = 1, titleResId = R.string.stepper_step_1_title, isActive = true),
    Step(id = 2, titleResId = R.string.stepper_step_2_title),
    Step(id = 3, titleResId = R.string.stepper_step_3_title)
)

Stepper(
    listStep = steps,
    onCurrentStep = { step -> /* Manejar cambio de paso */ }
)
```

## Configuración y personalización
- **colorIndicator**: Color personalizado para los indicadores.
- **listStep**: Lista de pasos a mostrar.
- **onCurrentStep**: Callback para manejar la selección de pasos.
- **stepSize**: Tamaño del indicador de paso.

Ejemplo de personalización:
```kotlin
Stepper(
    colorIndicator = Color.Red,
    listStep = steps,
    onCurrentStep = { step -> /* ... */ },
    stepSize = 24.dp
)
```

## Capturas de pantalla
*No aplica en este archivo, pero se recomienda agregar imágenes en la documentación principal del proyecto si es necesario.*

## Dependencias
- Jetpack Compose
- `uikit` (propio del proyecto)
- Recursos de dimensiones y colores definidos en el módulo

## Licencia
Este componente se distribuye bajo la licencia MIT.

## Autor
- Irving Lara
- 24 de septiembre del 2025

