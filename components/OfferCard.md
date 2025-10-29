# OfferCard

Descripción: Componente visual que muestra una tarjeta de oferta con información como tipo, título, descripción e imagen. Ideal para mostrar promociones u oportunidades disponibles para el usuario en Android.

## Ejemplo de uso
```kotlin
val offer = Offer(
    offerType = OfferType.DEBIT_CARD,
    title = "Contrata ahora el programa 0",
    description = "Recupera dinero con cashback en tu débito",
    image = R.drawable.ic_bags,
    onClick = { /* Acción al seleccionar oferta */ }
)
OfferCard(
    offer = offer
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.model.Offer
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.OfferCard
   import com.invex.one.uikit.model.Offer
   import com.invex.one.uikit.model.OfferType
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

