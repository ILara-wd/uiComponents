# ExpandableCreditCard

Descripción: Componente que muestra información de tarjeta de crédito en formato expandible. Permite ocultar/mostrar detalles y configurar acciones personalizadas, como botones para pagar o diferir pagos.

## Ejemplo de uso
```kotlin
val info = ExpandableCreditCardInfo(
    cardName = "Invex Oro",
    lastDigits = "****1234",
    balance = "$10,000.00",
    dailyBalance = "$500.00",
    minPayment = "$1,000.00",
    dueDate = "30/09/2025"
)
val config = ExpandableCreditCardConfig(
    cardIcon = R.drawable.tiny_credit_card,
    isInitiallyExpanded = true,
    buttons = listOf(ButtonItem(label = "Pagar", onClick = { /* Acción */ }, enabled = true))
)
ExpandableCreditCard(
    info = info,
    config = config
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.model.ButtonItem
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.ExpandableCreditCard
   import com.invex.one.uikit.components.cards.ExpandableCreditCardInfo
   import com.invex.one.uikit.components.cards.ExpandableCreditCardConfig
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

