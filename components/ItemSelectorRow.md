# ItemSelectorRow

Descripción: Componente de fila reutilizable para selección de ítems con avatar, texto y selector (checkbox o radio). Ideal para listas de contactos, tarjetas u opciones de pago en Android.

## Ejemplo de uso
```kotlin
ItemSelectorRow(
    avatar = { Avatar(initials = "AB", size = ProfileIconSizes.SIZE_LARGE) },
    itemSelectorRowParams = ItemSelectorRowParams(
        title = "Nombre",
        subtitle = "Tipo de cuenta",
        titleValue = "Saldo",
        valueText = "$5,000",
        valueTextColor = Color.Red,
        type = Constants.RADIOBUTTON,
        selected = true
    ),
    onSelectedChange = { /* Acción al seleccionar */ }
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.components.buttons.CustomCheckbox
- com.invex.one.uikit.components.buttons.CustomRadioButton
- com.invex.one.uikit.components.icon.Avatar
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.ItemSelectorRow
   import com.invex.one.uikit.components.cards.ItemSelectorRowParams
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

