# CardDateRangePicker

Componente para seleccionar un rango de fechas dentro de una tarjeta visual, ideal para filtros y formularios en Android con Jetpack Compose.

## Características principales
- Selector de rango de fechas con formato personalizado.
- Visualización clara de fecha inicial y final.
- Personalización de estilos y formato de fecha.
- Callback para cambios en el rango seleccionado.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+
- Jetpack Compose
- kotlinx-datetime

## Guía de uso
```kotlin
val currentDate: LocalDate = Clock.System.now()
    .toLocalDateTime(TimeZone.currentSystemDefault())
    .date
CardDateRangePicker(
    initialStartDate = currentDate,
    initialEndDate = currentDate,
    onDateRangeChanged = { start, end ->
        // Manejar rango seleccionado
    }
)
```

## Configuración y personalización
- Personaliza el formato de fecha y estilos visuales:
```kotlin
CardDateRangePicker(
    initialStartDate = start,
    initialEndDate = end,
    onDateRangeChanged = { s, e -> /* ... */ },
    dateFormatter = { date -> date.toJavaLocalDate().format(DateTimeFormatter.ofPattern("dd MMM yyyy")) }
)
```

## Dependencias
- implementation("androidx.compose.material3:material3:1.2.0")
- implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.4.0")

## Instalación
1. Agrega las dependencias en tu archivo build.gradle.kts.
2. Importa el componente y úsalo en tu UI Compose.

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

