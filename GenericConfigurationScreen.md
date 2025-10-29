# GenericConfigurationScreen

Descripción: Componente de pantalla genérica para mostrar icono, título, descripción, opción de checkbox y botones configurables. Ideal para flujos de configuración, activación de biométricos o mensajes informativos en Android.

## Ejemplo de uso
```kotlin
GenericConfigurationScreen(
    resource = R.drawable.ic_dactilar,
    mainText = "Habilitar huella digital",
    descriptionText = "Inicia sesión tan solo con tu huella digital sin tener que ingresar tu contraseña",
    checkboxConfig = CheckboxConfig(
        text = "No volver a mostrar este mensaje",
        isChecked = false,
        onCheckedChange = {}
    ),
    buttonsConfig = ButtonsConfig(
        primaryButtonText = "Ingresa a tu app",
        onPrimaryButtonClick = {},
        secondaryButtonText = "Ahora no",
        onSecondaryButtonClick = {}
    )
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.theme
- com.invex.one.uikit.components.buttons
- com.invex.one.uikit.components.label

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.GenericConfigurationScreen
   import com.invex.one.uikit.components.CheckboxConfig
   import com.invex.one.uikit.components.ButtonsConfig
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

