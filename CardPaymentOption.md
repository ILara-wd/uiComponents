# CardPaymentOption

Descripción: Componente que representa una opción de pago dentro de una lista, con radio button seleccionable. Permite incluir título, descripción opcional y monto asociado. Ideal para formularios de selección de métodos o montos de pago.

## Ejemplo de uso
```kotlin
CardPaymentOption(
    title = "Pago mínimo",
    amount = "$1,250.00",
    description = "Pago mínimo requerido este mes",
    isSelected = true,
    onSelect = { /* Acción al seleccionar */ }
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.foundation
- androidx.compose.material3
- com.invex.one.uikit.components.buttons.CustomRadioButton
- com.invex.one.uikit.components.label.SimpleLabel
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.CardPaymentOption
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

