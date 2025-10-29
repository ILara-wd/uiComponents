# CustomBottomSheets

Descripción: Componente para mostrar diálogos tipo bottom sheet personalizables, con soporte para título, subtítulo, botones de acción y contenido visual adaptable en Android.

## Ejemplo de uso
```kotlin
CustomBottomSheets(
    title = "Título",
    subTitle = "Descripción del diálogo",
    textConfirmButton = "Confirmar",
    textCancelButton = "Cancelar",
    showBottomSheet = true,
    onConfirm = { /* Acción de confirmación */ },
    onCancel = { /* Acción de cancelación */ }
)

CustomBottomSheets(
    content = {
        // Contenido personalizado aquí
    },
    showBottomSheet = true,
    cancelable = true,
    onDismiss = { /* Acción al cerrar */ }
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.theme
- com.invex.one.uikit.components.buttons

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.CustomBottomSheets
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

