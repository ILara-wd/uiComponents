# CardCarousel

Descripción: Componente que muestra un carrusel horizontal de tarjetas de ofertas dentro de una columna, con título y lista de tarjetas alineadas horizontalmente. Ideal para mostrar promociones, productos o servicios en Android.

## Ejemplo de uso
```kotlin
CardCarousel(
    title = "Ofertas para ti",
    offers = listOf(
        Offer(
            offerType = OfferType.DEBIT_CARD,
            title = "Contrata ahora el programa 0",
            description = "Con cada compra que hagas, recupera dinero con cashback en tu débito",
            image = R.drawable.ic_bags,
            onClick = {},
        ),
        Offer(
            offerType = OfferType.CREDIT_CARD,
            title = "¡Consigue más con cada compra!",
            description = "Difiere todas tus compras a meses sin intereses.",
            image = R.drawable.ic_bags,
            onClick = {},
        )
    )
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- androidx.compose.foundation.lazy
- com.invex.one.uikit.model.Offer
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.CardCarousel
   import com.invex.one.uikit.model.Offer
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

