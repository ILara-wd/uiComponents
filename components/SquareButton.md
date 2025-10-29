# SquareButton - Botón Cuadrado para Android

## Descripción breve
`SquareButton` es un componente Jetpack Compose que representa un botón de forma cuadrada, ideal para acciones rápidas, accesos directos o menús visuales en la interfaz.

## Características principales
- Forma cuadrada y tamaño personalizable.
- Soporte para ícono, texto o ambos.
- Personalización de color, bordes y estado habilitado/deshabilitado.
- Integración sencilla en menús, cuadrículas y barras de herramientas.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
import com.invex.one.uikit.components.buttons.SquareButton
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.invex.one.uikit.R

SquareButton(
    icon = ImageVector.vectorResource(R.drawable.ic_home),
    text = "Inicio",
    onClick = { /* Acción cuadrada */ },
    enabled = true
)
```

## Configuración y personalización
- `icon`: Ícono vectorial mostrado en el botón (opcional).
- `text`: Texto mostrado en el botón (opcional).
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

