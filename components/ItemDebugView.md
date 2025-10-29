# ItemDebugView - Vista de Ítem de Debug para Android

## Descripción breve
`ItemDebugView` es un componente Jetpack Compose que permite mostrar información detallada de un ítem de depuración, como variables, valores, estados o resultados de pruebas. Es ideal para herramientas de desarrollo, paneles de debug y visualización de datos técnicos.

## Características principales
- Visualización clara de nombre, valor y estado de ítems de debug.
- Soporte para diferentes tipos de datos y estados.
- Personalización de colores, estilos y disposición.
- Integración sencilla en paneles de debug y herramientas de desarrollo.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
import com.invex.one.uikit.components.developer.ItemDebugView

ItemDebugView(
    label = "Token",
    value = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...",
    status = DebugStatus.Success
)
```

## Configuración y personalización
- `label`: Nombre o descripción del ítem de debug.
- `value`: Valor o estado actual.
- `status`: Estado del ítem (éxito, error, advertencia, etc.).
- `modifier`: Personalización de tamaño, padding, etc.
- Personalización de colores y estilos mediante temas.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

