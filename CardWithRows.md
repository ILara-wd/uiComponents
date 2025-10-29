# CardWithRows

Descripción: Componente que muestra una tarjeta con filas, cada una con ícono, texto principal, texto secundario opcional y flecha de navegación. Incluye estados de carga, éxito y error, y es ideal para mostrar listas de cuentas, productos o accesos rápidos en Android.

## Ejemplo de uso
```kotlin
val items = listOf(
    CardRowItem(
        icon = R.drawable.ic_card,
        text = "Cuenta de ahorro",
        secondaryText = "****1234",
        onClick = { /* Acción al seleccionar */ }
    ),
    CardRowItem(
        icon = R.drawable.ic_star,
        text = "Cuenta digital",
        secondaryText = "****5678",
        isSimpleAsset = true,
        onClick = { /* Acción al seleccionar */ }
    )
)
CardWithRows(
    items = items,
    state = StateSkeleton.Success
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.components.skeleton.CardContainerSkeleton
- com.invex.one.uikit.components.skeleton.StateSkeleton
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.CardWithRows
   import com.invex.one.uikit.components.cards.CardRowItem
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

