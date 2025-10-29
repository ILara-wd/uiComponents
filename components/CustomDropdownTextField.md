# CustomDropdownTextField

Descripción: Campo de texto con menú desplegable para seleccionar opciones, ideal para formularios y filtros en Android. Permite mostrar una lista de elementos y seleccionar uno, con integración visual y validación.

## Ejemplo de uso
```kotlin
CustomDropdownTextField(
    value = "Opción 1",
    onValueChange = { /* Actualiza el valor */ },
    options = listOf("Opción 1", "Opción 2", "Opción 3"),
    label = "Selecciona una opción",
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
   import com.invex.one.uikit.components.textField.CustomDropdownTextField
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

