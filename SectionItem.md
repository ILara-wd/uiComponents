# SectionItem

Componente para mostrar elementos dentro de una sección, ideal para listas, formularios o agrupaciones de datos.

## Características principales
- Visualización de ítem con texto y/o ícono.
- Soporte para acciones y eventos.
- Personalización de estilos y layout.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+

## Guía de uso
```kotlin
val item = SectionItem(context)
item.setText("Correo electrónico")
item.setIcon(R.drawable.ic_email)
item.setOnClickListener { /* Acción */ }
```

## Configuración y personalización
- Cambia el fondo y el estilo del texto:
```kotlin
item.setBackgroundColor(Color.LTGRAY)
item.setTextStyle(Typeface.BOLD)
```

## Dependencias
- implementation("androidx.core:core-ktx:1.12.0")

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

