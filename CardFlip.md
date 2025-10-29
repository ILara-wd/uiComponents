# CardFlip

Descripción: Componente que representa una tarjeta interactiva con animación de giro (flip). Permite alternar entre mostrar el frente y reverso de la tarjeta, mostrando datos como nombre, número, fecha de vencimiento y CVV. Ideal para interfaces de tarjetas bancarias en Android.

## Ejemplo de uso
```kotlin
CardFlip(
    cardHolderName = "Juan Pérez",
    cardNumber = "**** **** **** 1234",
    expiryDate = "12/26",
    cvv = "123"
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- androidx.compose.foundation
- androidx.compose.ui.graphics
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.CardFlip
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

