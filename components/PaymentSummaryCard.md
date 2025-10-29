# PaymentSummaryCard

Descripción: Componente que muestra un resumen visual del pago, incluyendo el monto a pagar, la tarjeta destino y la cuenta de origen. Ideal para flujos de confirmación de pagos en Android.

## Ejemplo de uso
```kotlin
val cardToPay = CreditCard(
    cardName = "Tarjeta Manchester",
    availableCredit = "$50,000.00",
    logo = R.drawable.ic_manchester_mini_card,
    backgroundGradient = SunsetGradient.Manchester(),
    account = "4539 1234 5678 9012",
    cardNumber = "****9012",
    expiration = "12/25",
    cvc = "123",
    productId = "MANVS"
)
val originAccount = DebitCard(
    cardName = "Tarjeta Débito Now",
    availableBalance = "$75,000.00",
    logo = R.drawable.ic_dedit_now_mini_card,
    backgroundGradient = SunsetGradient.NOW(),
    account = "4539 9876 5432 1098",
    cardNumber = "****1098",
    expiration = "12/25",
    cvc = "123"
)
PaymentSummaryCard(
    amountToPay = "$3,500.00",
    cardToPay = cardToPay,
    originAccount = originAccount
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.model.CreditCard
- com.invex.one.uikit.model.DebitCard
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.PaymentSummaryCard
   import com.invex.one.uikit.model.CreditCard
   import com.invex.one.uikit.model.DebitCard
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

