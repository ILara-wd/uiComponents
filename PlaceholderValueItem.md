# PlaceholderValueItem

Descripción: Componente para mostrar pares de marcador de posición y valor, útil para resúmenes de datos personales, bancarios o cualquier información clave-valor en Android. Incluye utilidades para mostrar listas agrupadas y disposición flexible.

## Ejemplo de uso
```kotlin
val items = listOf(
    PlaceholderValueData(placeholder = "Nombre", value = "Juan Pérez"),
    PlaceholderValueData(placeholder = "Email", value = "juan@email.com"),
    PlaceholderValueData(placeholder = "CURP", value = "PEPJ800101HDFRRN09", fullSpan = true)
)
PlaceholderValueList(items = items)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.PlaceholderValueItem
   import com.invex.one.uikit.components.PlaceholderValueList
   import com.invex.one.uikit.components.PlaceholderValueData
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

