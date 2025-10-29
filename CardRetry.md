# CardRetry

Descripción: Componente visual que muestra una tarjeta informativa con mensaje, ícono y botón de acción secundaria para reintentar una operación. Ideal para mostrar errores o eventos y ofrecer al usuario la posibilidad de reintentar.

## Ejemplo de uso
```kotlin
CardRetry(
    message = "No se pudo cargar la información.",
    textButton = "Reintentar",
    buttonRetryShow = true,
    icon = R.drawable.ic_alert,
    iconColor = Color.Red,
    onClickButton = { /* Acción de reintento */ }
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.components.buttons.SecondaryButton
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.CardRetry
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

