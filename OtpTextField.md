# OtpTextField

Descripción: Campo de texto especializado para ingresar códigos OTP (One-Time Password), mostrando casillas individuales, validación automática y opción de ofuscación. Ideal para flujos de autenticación en Android.

## Ejemplo de uso
```kotlin
OtpTextField(
    value = "123456",
    hint = "0",
    onValueChange = { /* Actualiza el código OTP */ },
    config = OtpTextFieldConfig(enabled = true, isObfuscated = true)
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.components.textField.validator.ValidatorBuilder
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.textField.OtpTextField
   import com.invex.one.uikit.components.textField.OtpTextFieldConfig
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

