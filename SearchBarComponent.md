# SearchBarComponent

Descripción: Barra de búsqueda con campo de texto, ícono de búsqueda y botón de borrado. Permite mostrar texto de ayuda, validación personalizada y estados de error. Ideal para filtrar listas y realizar búsquedas en Android.

## Ejemplo de uso
```kotlin
SearchBarComponent(
    value = "Buscar...",
    hint = "Buscar por nombre",
    onValueChange = { /* Actualiza el texto */ },
    onClearClick = { /* Limpia el campo */ },
    config = SearchBarConfig(supportingText = "Puedes buscar por nombre o número")
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.textField.SearchBarComponent
   import com.invex.one.uikit.components.textField.SearchBarConfig
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

