# TextFieldPassword

Descripción: Campo de texto especializado para contraseñas, con opción de mostrar/ocultar el contenido, validación y animación de hint. Ideal para formularios de autenticación en Android.

## Ejemplo de uso
```kotlin
TextFieldPassword(
    state = TextFieldState(value = "MiContraseña123", onValueChange = { /* Actualiza la contraseña */ }),
    appearance = TextFieldAppearance(hint = "Contraseña", isPasswordField = true, showPasswordToggle = true),
    validation = TextFieldValidation(maxCharacters = 30)
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
   import com.invex.one.uikit.components.textField.TextFieldPassword
   import com.invex.one.uikit.components.textField.config.TextFieldState
   import com.invex.one.uikit.components.textField.config.TextFieldAppearance
   import com.invex.one.uikit.components.textField.config.TextFieldValidation
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

