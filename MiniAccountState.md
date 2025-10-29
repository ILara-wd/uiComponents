# MiniAccountState

Descripción: Conjunto de componentes para mostrar el estado resumido de cuentas Claire, crédito y débito. Incluye tarjetas con información financiera como crédito disponible, saldo, pagos mensuales, fechas límite y progreso visual.

## Ejemplo de uso
```kotlin
MiniAccountStateClaireCard(
    creditAmount = "$150,000.00",
    balanceDue = "$0.00",
    monthlyPayment = "$0.00",
    paymentDueDate = "25 de agosto"
)

MiniAccountStateDebitCard(
    currentMonthValue = "$150,000.00",
    previousMonthValue = "$120,000.00",
    currentRate = "10.00%",
    onIconClick = { /* Acción de info */ }
)

MiniAccountStateCreditCard(
    miniAccountStateCreditParams = MiniAccountStateCreditParams(
        creditAvailable = "$150,000.00",
        authorizedCredit = "$200,000.00",
        amountToPay = "$0.00",
        minPay = "$5,000.00",
        creditAmount = "$200,000.00",
        finishCreditDay = "25 de agosto",
        dayLimitPay = "28 de agosto",
        currentBalance = "$120,000.00",
        available = "$150,000.00",
        isSecurityLineAmount = true
    ),
    onIconClick = { /* Acción de info */ }
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.theme
- com.invex.one.uikit.components.loaders.CustomLinearProgress

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa los componentes en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.MiniAccountStateClaireCard
   import com.invex.one.uikit.components.cards.MiniAccountStateDebitCard
   import com.invex.one.uikit.components.cards.MiniAccountStateCreditCard
   import com.invex.one.uikit.components.cards.MiniAccountStateCreditCardAdditional
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

