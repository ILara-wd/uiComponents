# FilterChip

Descripción: Componente de chip para filtros y selección múltiple, ideal para interfaces de búsqueda y categorización en Android. Permite mostrar opciones en formato compacto y seleccionar/desmarcar cada una, además de agrupar chips y personalizar su estilo.

## Ejemplo de uso
```kotlin
FilterChipGroup(
    filters = listOf("Activo", "Pendiente", "Completado"),
    onRemoveFilter = { removedFilter -> /* Acción al eliminar filtro */ }
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
   import com.invex.one.uikit.components.textField.FilterChipGroup
   import com.invex.one.uikit.components.textField.CustomFilterChip
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

