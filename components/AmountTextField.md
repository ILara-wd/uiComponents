# AmountTextField

Descripción: Campo de texto especializado para ingresar montos numéricos, con formato automático y validación, ideal para flujos financieros en Android.

## Ejemplo de uso
```kotlin
AmountTextField(
    value = "1000",
    onValueChange = { /* Actualiza el valor */ },
    label = "Monto",
    isError = false
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.components.textField.validator

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.textField.AmountTextField
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

