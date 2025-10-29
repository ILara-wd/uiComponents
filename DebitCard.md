# DebitCard

Descripción: Componente para mostrar información de una tarjeta de débito, incluyendo saldo, número de tarjeta, rendimiento acumulado, tasa y botones de acción. Permite navegación y muestra títulos personalizados.

## Ejemplo de uso
```kotlin
val buttons = listOf(ButtonItem(label = "Ver movimientos", onClick = { /* Acción */ }, enabled = true))
val titles = DebitCardTitles(
    nameCard = "Invex Débito",
    topText = "Saldo disponible",
    middleText = "Rendimiento acumulado",
    endText = "Tasa actual"
)
DebitCard(
    balance = "$5,000.00",
    cardNumber = "****1234",
    cumulativeReturn = "$200.00",
    rate = "3.5%",
    buttons = buttons,
    onNavigate = { /* Acción de navegación */ },
    onInfoClick = { /* Acción de info */ },
    debitCardTitles = titles
)
```

## Dependencias
- Jetpack Compose
- com.invex.one.uikit.model.ButtonItem
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.DebitCard
   import com.invex.one.uikit.model.ButtonItem
   import com.invex.one.uikit.components.cards.DebitCardTitles
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

