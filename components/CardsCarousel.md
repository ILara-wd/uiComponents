# CardsCarousel

Descripción: Componente principal para mostrar un carrusel horizontal de tarjetas de crédito con animaciones, selección, indicadores y opción de voltear la tarjeta para mostrar el reverso. Permite personalizar el color, la lista de tarjetas, el estado de carga y callbacks para acciones como copiar número o voltear la tarjeta.

## Ejemplo de uso
```kotlin
CreditCardCarousel(
    creditCardCarouselConfig = CreditCardCarouselConfig(
        color = Color.Blue,
        cards = listOf(/* lista de CreditCard */),
        cardSelected = 0,
        isFlippedExternal = false
    ),
    onButtonClick = { /* Acción al voltear */ },
    onTaggClickFlipCard = { card, isFlipped -> /* Taggeo flip */ },
    onTaggClickCopyNumber = { card -> /* Taggeo copiar número */ },
    stateSkeleton = StateSkeleton.Success,
    onCardSelected = { card -> /* Acción al seleccionar tarjeta */ }
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- androidx.compose.foundation
- androidx.compose.foundation.lazy
- com.invex.one.uikit.model.CreditCard
- com.invex.one.uikit.theme
- com.invex.one.uikit.components.skeleton

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.cardsCarousel.CardsCarousel
   import com.invex.one.uikit.components.cards.cardsCarousel.CreditCardCarouselConfig
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

