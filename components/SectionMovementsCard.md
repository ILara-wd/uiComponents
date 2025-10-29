# SectionMovementsCard

Descripción: Componente que agrupa movimientos bancarios bajo un título (sección), mostrando cada movimiento en formato de tarjeta con información relevante y separadores visuales. Ideal para organizar listas de transacciones por fecha o categoría en Android.

## Ejemplo de uso
```kotlin
val todayMovements = listOf(
    Movement(
        merchant = "Farfetch",
        date = LocalDate.now(),
        amount = 24000.0,
        status = MovementStatus.InTransit
    ),
    Movement(
        merchant = "MercadoPago",
        date = LocalDate.now(),
        amount = 24000.0,
        status = MovementStatus.Completed
    )
)
SectionMovementsCard(
    sectionMovements = SectionMovements(
        title = "Hoy",
        movements = todayMovements
    ),
    onItemClick = { movement -> /* Acción al seleccionar movimiento */ }
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.components.ItemRowCard
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.SectionMovementsCard
   import com.invex.one.uikit.components.cards.SectionMovements
   import com.invex.one.uikit.components.cards.Movement
   import com.invex.one.uikit.components.cards.MovementStatus
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

