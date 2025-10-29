# SimpleButton - Botón Simple para Android

## Descripción breve
`SimpleButton` es un componente Jetpack Compose que representa un botón de acción básico, ideal para acciones secundarias, terciarias o de bajo énfasis en la interfaz.

## Características principales
- Estilo visual minimalista y personalizable.
- Soporte para estados habilitado/deshabilitado.
- Personalización de texto, color, tamaño y bordes.
- Integración sencilla en formularios, diálogos y pantallas secundarias.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
import com.invex.one.uikit.components.buttons.SimpleButton

SimpleButton(
    text = "Ver más",
    onClick = { /* Acción simple */ },
    enabled = true
)
```

## Configuración y personalización
- `text`: Texto del botón.
- `onClick`: Acción al presionar el botón.
- `enabled`: Estado habilitado/deshabilitado.
- `modifier`: Personalización de tamaño, padding, etc.
- Personalización de colores y bordes mediante temas.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

