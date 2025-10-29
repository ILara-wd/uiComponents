# TopAppBarPrimary - Barra Superior Principal para Android

## Descripción breve
`TopAppBarPrimary` es un componente Jetpack Compose que implementa una barra superior principal con fondo degradado, navegación lateral y hasta tres acciones configurables. Permite mostrar un saludo personalizado y se integra fácilmente en pantallas principales de aplicaciones móviles.

## Características principales
- Fondo degradado personalizable.
- Soporte para navegación lateral (Drawer).
- Hasta tres íconos de acción configurables.
- Saludo personalizado debajo de la barra.
- Integración sencilla con Jetpack Compose.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso

```kotlin
import com.invex.one.uikit.components.bar.TopAppBarPrimary
import com.invex.one.uikit.components.bar.TopAppBarActions
import androidx.compose.material3.rememberDrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.runtime.rememberCoroutineScope

val drawerState = rememberDrawerState(DrawerValue.Closed)
val scope = rememberCoroutineScope()

TopAppBarPrimary(
    drawerState = drawerState,
    scope = scope,
    actions = TopAppBarActions(
        firstIcon = { /* Ícono personalizado */ },
        secondIcon = { /* Ícono personalizado */ },
        thirdIcon = { /* Ícono personalizado */ }
    ),
    hiText = "¡Hola, usuario!"
)
```

## Configuración y personalización
- `drawerState`: Estado del drawer lateral.
- `scope`: CoroutineScope para abrir el drawer.
- `actions`: Configuración de hasta tres íconos de acción.
- `hiText`: Texto de saludo personalizado.
- `showNavigationIcon`: Mostrar/ocultar ícono de navegación.
- `backgroundBrush`: Personalización del fondo degradado.
- `modifier`: Modificador Compose para tamaño, padding, etc.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

