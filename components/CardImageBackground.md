# CardImageBackground

Descripción: Componente para mostrar una imagen con el mismo tamaño y forma que las tarjetas del carrusel. Útil para mostrar tarjetas estáticas, como en el caso de tarjetas Clair, y para estados de carga o error.

## Ejemplo de uso
```kotlin
CreditCardImageBackground(
    imageBackground = R.drawable.ic_card_vector_itgmg_back,
    stateSkeleton = StateSkeleton.Success
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.foundation
- androidx.compose.ui.res
- com.invex.one.uikit.components.skeleton.ContainerSkeleton
- com.invex.one.uikit.components.skeleton.StateSkeleton

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.cardsCarousel.CardImageBackground
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

