# BulletPoint

Descripción: Componente para mostrar puntos de lista con icono y texto, útil para resaltar reglas, características o pasos en interfaces Android.

## Ejemplo de uso
```kotlin
BulletPoint(
    icon = R.drawable.ic_password_validator_check,
    text = "Contraseña válida"
)

val bulletPoints = listOf(
    BulletPointItem(
        icon = R.drawable.ic_password_validator_check,
        text = "Mayúsculas y minúsculas"
    ),
    BulletPointItem(
        icon = R.drawable.ic_password_validator_error,
        text = "Sin caracteres repetidos"
    )
)
BulletPointList(items = bulletPoints)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- androidx.compose.foundation
- androidx.compose.ui.res
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.BulletPoint
   import com.invex.one.uikit.components.BulletPointList
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

