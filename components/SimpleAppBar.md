# SimpleAppBar - Barra Superior Personalizable para Android

## Descripción breve
`SimpleAppBar` es un componente Jetpack Compose que implementa una barra superior personalizable, permitiendo mostrar un título, íconos de navegación y acciones, con opciones avanzadas de estilo, estado de carga y apariencia. Es ideal para pantallas principales y secundarias en aplicaciones móviles.

## Características principales
- Título personalizable con alineación y estilo.
- Soporte para ícono de navegación (izquierda) y múltiples íconos de acción (derecha).
- Estado de carga (skeleton) para el título.
- Personalización de color de fondo, sombra y comportamiento de scroll.
- Configuración avanzada mediante `CustomAppBarConfig`.
- Compatible con temas y tipografías del proyecto.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso

### Implementación básica
```kotlin
import com.invex.one.uikit.components.bar.CustomAppBar
import com.invex.one.uikit.model.IconItem
import com.invex.one.uikit.theme.OneTypography
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.invex.one.uikit.R

CustomAppBar(
    title = "Bienvenido",
    navigationIcon = IconItem(
        icon = ImageVector.vectorResource(R.drawable.ic_arrow_left),
        contentDescription = "Atrás",
        onClick = { /* Acción de navegación */ }
    ),
    rightIcons = listOf(
        IconItem(
            icon = ImageVector.vectorResource(R.drawable.ic_bell),
            contentDescription = "Notificaciones",
            onClick = { /* Acción de notificación */ }
        )
    ),
    config = CustomAppBarConfig(
        titleStyle = OneTypography.bodyLarge,
        isLoading = false,
        textAlign = TextAlign.Start,
        isStatusBarAppearanceLight = true
    ),
    containerColor = Color.White
)
```

### Estado de carga (skeleton)
```kotlin
CustomAppBar(
    title = "Cargando...",
    navigationIcon = null,
    rightIcons = null,
    config = CustomAppBarConfig(
        isLoading = true,
        textAlign = TextAlign.Center
    )
)
```

## Configuración y personalización
- `title`: Texto del título.
- `navigationIcon`: Ícono de navegación (izquierda), opcional.
- `rightIcons`: Lista de íconos de acción (derecha), opcional.
- `shadowElevation`: Elevación de la sombra.
- `containerColor`: Color de fondo de la barra.
- `scrollBehavior`: Comportamiento de desplazamiento.
- `config`: Configuración avanzada (`CustomAppBarConfig`).
    - `titleStyle`: Estilo de texto del título.
    - `isLoading`: Estado de carga (skeleton).
    - `textAlign`: Alineación del título.
    - `isStatusBarAppearanceLight`: Apariencia de la barra de estado.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- `com.invex.one.uikit.model.IconItem`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

