# CardCarouselFront

Descripción: Componente que representa la parte frontal de una tarjeta en el carrusel de tarjetas. Muestra el logotipo de Invex, la marca de la tarjeta (Visa, MasterCard, etc.), el crédito disponible y un fondo con gradiente personalizado. Aplica una capa translúcida si la tarjeta no está seleccionada.

## Ejemplo de uso
```kotlin
CardCarouselFront(
    card = CreditCard(
        activedCard = true,
        cardName = "Invex Oro",
        availableCredit = "$10,000.00",
        logo = R.drawable.ic_card_vector_itgmg_back,
        account = "****1234",
        cardNumber = "1234 5678 9012 3456",
        cardNumberDigital = "1234 5678 9012 3456",
        expiration = "12/28",
        cvc = "123",
        productId = "VL2VP"
    ),
    isSelected = true
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- androidx.compose.foundation
- androidx.compose.ui.res
- com.invex.one.uikit.model.CreditCard
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.cardsCarousel.CardCarouselFront
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

