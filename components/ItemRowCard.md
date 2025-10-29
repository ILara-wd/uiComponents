# ItemRowCard

Descripción: Componente para mostrar filas de información con título, subtítulo, descripción, valores y acciones, ideal para listas, resúmenes o tarjetas en Android.

## Ejemplo de uso
```kotlin
ItemRowCard(
    content = ItemRowContent(
        title = "Cuenta de ahorro",
        sub = "Disponible",
        valueText = "$1,000.00",
        valueSubtitle = "MXN"
    ),
    icon = { res, fraction -> LogoComponent(resource = res, maxWithFraction = fraction) },
    iconAction = {
        Icon(
            painter = painterResource(id = R.drawable.ic_right),
            contentDescription = null
        )
    },
    onClick = { /* Acción al hacer clic */ }
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.theme
- com.invex.one.uikit.commons.Constants

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.ItemRowCard
   import com.invex.one.uikit.components.ItemRowContent
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

