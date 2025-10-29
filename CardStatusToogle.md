# CardStatusToogle

Descripción: Componente que muestra uno o dos switches para activar/desactivar estados relacionados con tarjetas, como activar/desactivar tarjeta física o digital. Permite personalizar el texto, estado inicial y acciones asociadas.

## Ejemplo de uso
```kotlin
CardStatusToggle(
    statusCardToggleFirst = CardStatusToggleInformation(
        title = "Tarjeta digital",
        stateToggle = StateToggle.ON,
        onClick = { /* Acción al cambiar estado */ }
    ),
    statusCardToggleSecond = CardStatusToggleInformation(
        title = "Tarjeta física",
        stateToggle = StateToggle.OFF,
        isActiveCard = false,
        textButton = "Solicitar",
        onTapActiveCard = { /* Acción al activar tarjeta física */ },
        onClick = { /* Acción al cambiar estado */ }
    )
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.components.buttons.CustomSwitch
- com.invex.one.uikit.components.text.TextIcon
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.CardStatusToogle
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

