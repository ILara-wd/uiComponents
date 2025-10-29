# ChipCard

Descripción: Componente tipo chip que muestra una etiqueta con fondo de gradiente y esquinas redondeadas. Útil para filtros, categorías, acciones rápidas o tags visuales interactivos en Android.

## Ejemplo de uso
```kotlin
ChipCard(
    text = "Crédito",
    gradientColors = listOf(Color.Magenta, Color.Blue),
    roundedCorner = 50,
    colorText = Color.White,
    onClick = { /* Acción al seleccionar chip */ }
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.foundation
- com.invex.one.uikit.components.label.SimpleLabel
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.ChipCard
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

