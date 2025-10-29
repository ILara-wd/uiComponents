# ClaireCard

Descripción: Componente visual que muestra una tarjeta informativa detallada sobre créditos pendientes, pagos mensuales y fechas límite, con opciones de navegación y pago. Ideal para mostrar información financiera relevante y ofrecer acciones rápidas al usuario en Android.

## Ejemplo de uso
```kotlin
ClaireCard(
    creditPending = "$5,000.00",
    cardNumber = "****1234",
    monthlyPayment = "$500.00",
    dueDate = "30/09/2025",
    onNavigate = { /* Acción de navegación */ },
    buttonItem = ButtonItem(label = "Pagar", onClick = { /* Acción de pago */ }, enabled = true)
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
   import com.invex.one.uikit.components.cards.ClaireCard
   import com.invex.one.uikit.model.ButtonItem
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

