# TopAppBarSecondary - Barra Superior Secundaria para Android

## Descripción breve
`TopAppBarSecondary` es un componente Jetpack Compose que implementa una barra superior secundaria con soporte para navegación, acciones personalizables y opción de refresco (pull-to-refresh). Permite mostrar un título, íconos de navegación y hasta tres acciones, integrándose fácilmente en pantallas secundarias de aplicaciones móviles.

## Características principales
- Soporte para navegación (botón de retroceso o ícono personalizado).
- Hasta tres íconos de acción configurables.
- Opción de refresco con indicador animado (pull-to-refresh).
- Personalización de colores, estilos y fondo.
- Compatible con temas y tipografías del proyecto.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso

```kotlin
import com.invex.one.uikit.components.bar.TopAppBarSecondary
import com.invex.one.uikit.components.bar.TopAppBarSecondaryNavigation
import com.invex.one.uikit.components.bar.TopAppBarActions
import com.invex.one.uikit.components.bar.TopAppBarStyle
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource

TopAppBarSecondary(
    topAppBarStyle = TopAppBarStyle(
        title = "Sección",
        backgroundColor = Color.Cyan
    ),
    navigation = TopAppBarSecondaryNavigation(
        showBackButton = true,
        onBackButtonClick = { /* Acción de retroceso */ }
    ),
    actions = TopAppBarActions(
        firstIcon = {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = null,
                tint = Color.Magenta,
                modifier = Modifier.size(dimensionResource(R.dimen.size_ui_23dp))
            )
        },
        secondIcon = {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = null,
                tint = Color.Magenta,
                modifier = Modifier.size(dimensionResource(R.dimen.size_ui_23dp))
            )
        }
    ),
    pullRefresh = true
)
```

## Configuración y personalización
- `topAppBarStyle`: Modelo de datos para título, color y estilo.
- `navigation`: Configuración de navegación (retroceso, ícono personalizado).
- `actions`: Hasta tres íconos de acción.
- `pullRefresh`: Habilita el refresco con indicador animado.
- `isStatusBarAppearanceLight`: Apariencia de la barra de estado.
- `content`: Composable para contenido debajo de la barra.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

