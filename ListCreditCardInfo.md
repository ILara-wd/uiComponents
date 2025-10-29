# ListCreditCardInfo

Descripción: Componente para mostrar una lista vertical de tarjetas de crédito usando LazyColumn, ajustando esquinas redondeadas según la posición de cada tarjeta. Permite seleccionar una tarjeta y ejecutar una acción asociada.

## Ejemplo de uso
```kotlin
val cards = listOf(
    CreditCardInfo(
        cardName = "Invex Oro",
        balance = "$10,000.00",
        cardNumber = "1234 5678 9012 3456"
    ),
    CreditCardInfo(
        cardName = "Invex Platinum",
        balance = "$20,000.00",
        cardNumber = "9876 5432 1098 7654"
    )
)
ListCreditCardInfo(cards = cards) { selectedCard ->
    // Acción al seleccionar la tarjeta
}
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.multipleCards.ListCreditCardInfo
   import com.invex.one.uikit.components.cards.multipleCards.CreditCardInfo
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

