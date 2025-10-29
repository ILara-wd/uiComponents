# SectionHeader

Componente para mostrar encabezados de sección en listas o formularios, mejorando la organización visual y la navegación.

## Características principales
- Encabezado con texto y estilos personalizados.
- Soporte para íconos opcionales.
- Fácil integración en RecyclerView y layouts.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+

## Guía de uso
```kotlin
val header = SectionHeader(context)
header.setTitle("Datos personales")
header.setIcon(R.drawable.ic_user)
```

## Configuración y personalización
- Modifica el color y el tamaño del texto:
```kotlin
header.setTextColor(Color.BLACK)
header.setTextSize(18f)
```

## Dependencias
- implementation("androidx.core:core-ktx:1.12.0")

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

