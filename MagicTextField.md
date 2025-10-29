# MagicTextField

Descripción: Campo de texto avanzado con validación dinámica, animaciones y soporte para estados personalizados, ideal para formularios interactivos en Android.

## Ejemplo de uso
```kotlin
MagicTextField(
    value = "Texto",
    onValueChange = { /* Actualiza el valor */ },
    label = "Nombre",
    isError = false,
    validationRule = ValidationRule.Required
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
   import com.invex.one.uikit.components.textField.MagicTextField
   import com.invex.one.uikit.components.textField.validator.ValidationRule
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

