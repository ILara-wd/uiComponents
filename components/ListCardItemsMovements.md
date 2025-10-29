# ListCardItemsMovements

Descripción: Componente que muestra una lista vertical agrupada de movimientos bancarios, organizada por secciones (ejemplo: Hoy, Ayer, Última semana). Cada sección utiliza una tarjeta visual y permite interacción con cada movimiento.

## Ejemplo de uso
```kotlin
val sections = listOf(
    SectionMovements("Hoy", listOf(/* movimientos */)),
    SectionMovements("Ayer", listOf(/* movimientos */))
)
ListCardItemsMovements(
    sections = sections,
    onItemClick = { movement -> /* Acción al seleccionar movimiento */ }
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.foundation.lazy.LazyColumn
- com.invex.one.uikit.components.cards.SectionMovementsCard
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.ListCardItemsMovements
   import com.invex.one.uikit.components.cards.SectionMovements
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

