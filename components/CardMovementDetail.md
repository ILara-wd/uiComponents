# CardMovementDetail

Descripción: Componente que muestra información sobre los detalles de movimientos en una tarjeta, presentando íconos y títulos con valores en formato de lista dentro de una tarjeta visual. Ideal para resúmenes de transacciones o detalles de movimientos en Android.

## Ejemplo de uso
```kotlin
val dataInfo = listOf(
    MovementDetailInfo(icon = R.drawable.ic_money, data = "$1,000.00"),
    MovementDetailInfo(title = R.string.movement_title, data = "Compra en tienda")
)
CardMovementDetail(dataInfo = dataInfo)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- androidx.compose.foundation.layout
- com.invex.one.uikit.theme
- com.invex.one.uikit.commons.Constants

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.movementdetail.CardMovementDetail
   import com.invex.one.uikit.components.cards.movementdetail.MovementDetailInfo
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

