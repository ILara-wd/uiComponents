# CustomEraseTextField

Descripción: Campo de texto con botón de borrado rápido, animación de hint y validación, ideal para formularios y búsquedas en Android. Permite al usuario limpiar el contenido del campo con un solo toque y muestra mensajes de error o información adicional.

## Ejemplo de uso
```kotlin
CustomEraseTextField(
    state = TextFieldState(value = "Texto", onValueChange = { /* Actualiza el valor */ }),
    appearance = TextFieldAppearance(hint = "Buscar"),
    validation = TextFieldValidation(maxCharacters = 30),
    infoText = "Puedes buscar por nombre o número",
    infoIcon = Icons.Default.Info
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
   import com.invex.one.uikit.components.textField.CustomEraseTextField
   import com.invex.one.uikit.components.textField.config.TextFieldState
   import com.invex.one.uikit.components.textField.config.TextFieldAppearance
   import com.invex.one.uikit.components.textField.config.TextFieldValidation
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

