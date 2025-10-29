# DateRangePicker

Componente para seleccionar un rango de fechas mediante un diálogo interactivo, ideal para filtros avanzados en Android con Jetpack Compose.

## Características principales
- Selector de rango de fechas con diálogo modal.
- Visualización y confirmación de fechas seleccionadas.
- Personalización de formato, textos y estilos.
- Callback para rango seleccionado.

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
DateRangePicker(
    defaultStartDate = currentDate,
    defaultEndDate = currentDate,
    onDateRangeSelected = { start, end ->
        // Manejar rango seleccionado
    }
)
```

## Configuración y personalización
- Personaliza textos, formato y estilos:
```kotlin
DateRangePicker(
    defaultStartDate = start,
    defaultEndDate = end,
    onDateRangeSelected = { s, e -> /* ... */ },
    config = DateRangePickerConfig(
        confirmButtonText = "Aceptar",
        dismissButtonText = "Cancelar",
        titleText = "Selecciona el rango",
        dateFormatter = { date -> date.toJavaLocalDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) }
    )
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

