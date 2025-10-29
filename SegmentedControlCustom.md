# SegmentedControlCustom

Componente para mostrar controles segmentados personalizables, ideal para navegación y selección de pestañas en Android con Jetpack Compose.

## Características principales
- Control segmentado con animaciones y estilos personalizados.
- Soporte para íconos y contenido dinámico por pestaña.
- Personalización de colores, tamaño y comportamiento.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+
- Jetpack Compose

## Guía de uso
```kotlin
val tabs = listOf(
    TabItem(title = "Tab 1", icon = R.drawable.ic_bell) {},
    TabItem(title = "Tab 2") {},
    TabItem(title = "Tab 3", icon = R.drawable.ic_add_user) {}
)
var selectedTab by remember { mutableIntStateOf(0) }
SegmentedControlCustom(
    tabs = tabs,
    selectedIndex = selectedTab,
    onTabSelected = { selectedTab = it }
)
```

## Configuración y personalización
- Modifica los íconos, colores y contenido de cada pestaña:
```kotlin
SegmentedControlCustom(
    tabs = myTabs,
    selectedIndex = selectedTab,
    onTabSelected = { /* ... */ }
)
```

## Dependencias
- implementation("androidx.compose.material3:material3:1.2.0")

## Instalación
1. Agrega la dependencia en tu archivo build.gradle.kts.
2. Importa el componente y úsalo en tu UI Compose.

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

