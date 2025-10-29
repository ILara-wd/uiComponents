# CardGuaranteed

Descripción: Componente de tarjeta informativa que muestra una descripción y un monto garantizado con estilo personalizable. Ideal para mostrar información financiera, montos disponibles o garantías en interfaces Android.

## Ejemplo de uso
```kotlin
val info = CardGuaranteedInfo(
    cardIcon = R.drawable.ic_card,
    description = "Monto disponible",
    descriptionSize = 14.sp,
    amount = "$10,000.00",
    amountSize = 18.sp
)
val style = CardGuaranteedStyle(
    textColor = Color.Gray,
    amountColor = Color.Black,
    arrowIconRes = R.drawable.ic_arrow_right,
    arrowTint = Color.Blue
)
CardGuaranteed(
    info = info,
    style = style,
    onClick = { /* Acción al presionar la tarjeta */ }
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- androidx.compose.foundation
- com.invex.one.uikit.theme
- com.invex.one.uikit.components.label.SimpleLabel

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.CardGuaranteed
   import com.invex.one.uikit.components.cards.CardGuaranteedInfo
   import com.invex.one.uikit.components.cards.CardGuaranteedStyle
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

