# CreditCard

Descripción: Componente que muestra una tarjeta de crédito con información relevante y botones de acción. Permite consultar datos como nombre, últimos dígitos, saldo, pagos y fechas, además de ejecutar acciones rápidas como pagar o navegar a detalles.

## Ejemplo de uso
```kotlin
val info = CreditCardInfo(
    cardName = "Invex Oro",
    lastDigits = "****1234",
    balance = "$10,000.00",
    dailyBalance = "$500.00",
    minPayment = "$1,000.00",
    dueDate = "30/09/2025"
)
val actions = CreditCardActions(
    onNavigate = { /* Acción de navegación */ },
    buttons = listOf(ButtonItem(label = "Pagar", onClick = { /* Acción de pago */ }, enabled = true))
)
CreditCard(
    info = info,
    actions = actions
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
   import com.invex.one.uikit.components.cards.CreditCard
   import com.invex.one.uikit.model.ButtonItem
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

