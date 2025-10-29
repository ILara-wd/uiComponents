# CreditCardInfoItem

Descripción: Componente para mostrar la vista de una tarjeta de crédito en una lista, con nombre, número, ícono, saldo y mensaje asociado. Incluye ícono de navegación para selección y soporte para pruebas automatizadas.

## Ejemplo de uso
```kotlin
CreditCardInfoItem(
    cardInfo = CreditCardInfo(
        cardName = "Invex Oro",
        balance = "$10,000.00",
        cardNumber = "1234 5678 9012 3456",
        messageBalance = "Saldo disponible"
    ),
    onSelectedCard = { /* Acción al seleccionar la tarjeta */ }
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- androidx.constraintlayout.compose.ConstraintLayout
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.multipleCards.CreditCardInfoItem
   import com.invex.one.uikit.components.cards.multipleCards.CreditCardInfo
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

