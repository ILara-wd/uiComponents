# CardDetailRewards

Descripción: Tarjeta que muestra el progreso del usuario dentro de un programa de recompensas, con hitos, etiquetas, indicador de avance y botón de acción. Ideal para gamificación y programas de lealtad en Android.

## Ejemplo de uso
```kotlin
val texts = CardDetailRewardsStrings(
    header = "Recompensas",
    level = "Nivel Oro",
    detail = "Acumula compras para subir de nivel",
    lastUpdated = "24/09/2025",
    buttonText = "Conoce tus beneficios"
)
val labels = CardDetailRewardsLabels(
    top = listOf("$100", "$200", "$300", "$400"),
    bottom = listOf("Item 1", "Item 2", "Item 3", "Item 4")
)
CardDetailRewards(
    texts = texts,
    steps = listOf(0, 100, 200, 300),
    labels = labels,
    currentAmount = 200,
    colorIndicator = null,
    onMoreInfoClick = {}
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.theme
- com.invex.one.uikit.commons.OneBoxWithConstraints

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.CardDetailRewards
   import com.invex.one.uikit.components.cards.CardDetailRewardsStrings
   import com.invex.one.uikit.components.cards.CardDetailRewardsLabels
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

