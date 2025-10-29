# PasswordValidator

Descripción: Componente para validar contraseñas mostrando reglas personalizadas y su cumplimiento, útil para flujos de registro y cambio de contraseña en Android.

## Ejemplo de uso
```kotlin
val passwordRules = listOf(
    PasswordRule("Mayúsculas y minúsculas") { it.any { c -> c.isUpperCase() } && it.any { c -> c.isLowerCase() } },
    PasswordRule("Sin caracteres repetidos") { !Regex("(.)\\1{3,}").containsMatchIn(it) }
)
PasswordValidator(password = "MiContraseña123", rules = passwordRules)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.PasswordValidator
   import com.invex.one.uikit.components.PasswordRule
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

