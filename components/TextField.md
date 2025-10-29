# TextField

Descripción: Campo de texto configurable con validación, animación de hint, soporte para contraseñas y contenido de apoyo. Ideal para formularios y entradas de datos en Android.

## Ejemplo de uso
```kotlin
TextField(
    state = TextFieldState(value = "Texto", onValueChange = { /* Actualiza el valor */ }),
    appearance = TextFieldAppearance(hint = "Nombre"),
    validation = TextFieldValidation(maxCharacters = 30),
    supportingContent = TextFieldSupportingContent(text = "Puedes ingresar tu nombre completo")
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.components.textField.config.TextFieldState
- com.invex.one.uikit.components.textField.config.TextFieldAppearance
- com.invex.one.uikit.components.textField.config.TextFieldValidation
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.textField.TextField
   import com.invex.one.uikit.components.textField.config.TextFieldState
   import com.invex.one.uikit.components.textField.config.TextFieldAppearance
   import com.invex.one.uikit.components.textField.config.TextFieldValidation
   import com.invex.one.uikit.components.textField.TextFieldSupportingContent
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

