# DebugHttpViewer - Visualizador de Debug HTTP para Android

## Descripción breve
`DebugHttpViewer` es un componente Jetpack Compose que permite visualizar y analizar solicitudes y respuestas HTTP en tiempo real, facilitando el debugging de APIs y servicios web en aplicaciones móviles.

## Características principales
- Visualización de solicitudes y respuestas HTTP.
- Soporte para mostrar encabezados, cuerpo y estado de la respuesta.
- Filtros y búsqueda por método, URL o estado.
- Integración sencilla en pantallas de desarrollo y debugging.
- Personalización de colores y estilos para estados (éxito, error, etc.).

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
import com.invex.one.uikit.components.developer.DebugHttpViewer

DebugHttpViewer(
    httpLogs = logs,
    onLogClick = { log -> /* Acción al seleccionar log */ }
)
```

## Configuración y personalización
- `httpLogs`: Lista de logs HTTP a mostrar.
- `onLogClick`: Callback al seleccionar un log.
- Personalización de colores y estilos mediante temas.
- Filtros y búsqueda por método, URL o estado.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

