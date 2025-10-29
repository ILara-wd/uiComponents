# OneLineRowCard

Descripción: Componente para mostrar una fila con el nombre y número de una tarjeta, junto con el ícono de la marca, en formato compacto y de una sola línea. Ideal para resúmenes o listas simples de tarjetas en Android.

## Ejemplo de uso
```kotlin
OneLineRowCard(
    cardInfo = CreditCardInfo(
        cardName = "Invex Oro",
        cardNumber = "1234 5678 9012 3456"
    )
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
   import com.invex.one.uikit.components.cards.multipleCards.OneLineRowCard
   import com.invex.one.uikit.components.cards.multipleCards.CreditCardInfo
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

