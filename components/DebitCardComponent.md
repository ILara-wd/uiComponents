# DebitCardComponent

Descripción: Componente visual que muestra información detallada sobre una tarjeta de débito, incluyendo saldo disponible, número de tarjeta, rendimiento acumulado, tasa actual y botones de acción personalizables. Permite navegación y consulta adicional mediante íconos interactivos.

## Ejemplo de uso
```kotlin
DebitCardComponent(
    balance = "$5,000.00",
    cardNumber = "****1234",
    cumulativeReturn = "$200.00",
    rate = "3.5%",
    buttons = listOf(ButtonItem(label = "Retirar", enabled = true) { /* Acción */ }),
    debitCardActions = DebitCardActions(onNavigate = { /* Navegar */ }, onInfoClick = { /* Info */ }),
    debitCardTitles = DebitCardTitles(
        nameCard = "Invex Débito",
        topText = "Saldo disponible",
        middleText = "Rendimiento acumulado",
        endText = "Tasa actual"
    )
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
   import com.invex.one.uikit.components.cards.DebitCardComponent
   import com.invex.one.uikit.model.ButtonItem
   import com.invex.one.uikit.components.cards.DebitCardActions
   import com.invex.one.uikit.components.cards.DebitCardTitles
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

