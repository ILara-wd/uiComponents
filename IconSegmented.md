# IconSegmented

Componente para mostrar íconos segmentados, útil para representar estados, progresos o acciones agrupadas.

## Características principales
- Visualización de íconos en segmentos.
- Personalización de cantidad, colores y estilos.
- Soporte para interacción y selección.
- Integración sencilla en barras de progreso o menús.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+

## Guía de uso
```kotlin
val segmented = IconSegmented(context)
segmented.setIcons(listOf(R.drawable.ic_home, R.drawable.ic_settings))
segmented.setOnSegmentSelected { index ->
    // Acción al seleccionar segmento
}
```

## Configuración y personalización
- Cambia el color y el estilo de los íconos:
```kotlin
segmented.setIconColor(Color.DKGRAY)
segmented.setSegmentStyle(IconSegmented.Style.ROUNDED)
```

## Dependencias
- implementation("androidx.core:core-ktx:1.12.0")

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025
# DropdownPaymentMethod

Componente para mostrar y seleccionar métodos de pago en formato desplegable, facilitando la experiencia de usuario en flujos de pago.

## Características principales
- Lista desplegable de métodos de pago.
- Personalización de íconos y estilos.
- Soporte para selección y eventos.
- Integración sencilla en formularios de pago.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+

## Guía de uso
```kotlin
val dropdown = DropdownPaymentMethod(context)
dropdown.setPaymentMethods(listOf("Tarjeta", "Transferencia", "Efectivo"))
dropdown.setOnMethodSelected { method ->
    // Acción al seleccionar método
}
```

## Configuración y personalización
- Personaliza el ícono y el estilo:
```kotlin
dropdown.setIcon(R.drawable.ic_card)
dropdown.setStyle(DropdownStyle.DEFAULT)
```

## Dependencias
- implementation("androidx.core:core-ktx:1.12.0")

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

