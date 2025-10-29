# CreditCardWithRows

Descripción: Componente que muestra una tarjeta con filas, cada una con ícono, texto principal, texto secundario opcional y flecha de navegación. Incluye estados de carga, éxito y error, y es ideal para mostrar listas de cuentas, productos o accesos rápidos en Android, con soporte para texto HTML en el contenido secundario.

## Ejemplo de uso
```kotlin
val items = listOf(
    CreditCardRowItem(
        icon = R.drawable.ic_card,
        text = "Cuenta de ahorro",
        secondaryText = "<b>****1234</b>",
        onClick = { /* Acción al seleccionar */ }
    ),
    CreditCardRowItem(
        icon = R.drawable.ic_star,
        text = "Cuenta digital",
        secondaryText = "<i>****5678</i>",
        isSimpleAsset = true,
        onClick = { /* Acción al seleccionar */ }
    )
)
CreditCardWithRows(
    items = items,
    state = StateSkeleton.Success
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.components.skeleton.CardContainerSkeleton
- com.invex.one.uikit.components.skeleton.StateSkeleton
- com.invex.one.uikit.components.text.CreditHtmlText
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.CreditCardWithRows
   import com.invex.one.uikit.components.cards.CreditCardRowItem
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

