# DatePicker

Componente para seleccionar una fecha individual mediante un calendario, diseñado para Jetpack Compose en Android.

## Características principales
- Selector de fecha con formato personalizado.
- Visualización clara y estilizada de la fecha seleccionada.
- Personalización de formato y estilos visuales.

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
DatePicker(
    initialStartDate = currentDate,
    dateFormatter = { date -> date.toJavaLocalDate().format(DateTimeFormatter.ofPattern("dd MMM yyyy")) }
)
```

## Configuración y personalización
- Modifica el formato de fecha y estilos visuales:
```kotlin
DatePicker(
    initialStartDate = currentDate,
    dateFormatter = { date -> date.toJavaLocalDate().format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy")) }
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

