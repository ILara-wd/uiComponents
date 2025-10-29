# MovementsCard

Descripción: Componente que muestra los últimos movimientos de la cuenta en formato de tarjeta, con soporte para estados de carga, éxito y error. Permite personalizar el título, el número de movimientos visibles y agregar una sección superior con controles o filtros.

## Ejemplo de uso
```kotlin
val movements = listOf(
    Movement(
        merchant = "Farfetch",
        date = LocalDate.of(2025, 2, 27),
        amount = 24000.0,
        status = MovementStatus.InTransit
    )
)
MovementsCard(
    config = MovementConfig(
        movements = movements,
        onItemClick = { /* Acción al seleccionar movimiento */ },
        visibleLimit = 3,
        title = "Mis movimientos"
    )
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.components.ItemRowCard
- com.invex.one.uikit.components.skeleton.ContainerSkeleton
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.MovementsCard
   import com.invex.one.uikit.components.cards.MovementConfig
   import com.invex.one.uikit.components.cards.Movement
   import com.invex.one.uikit.components.cards.MovementStatus
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

