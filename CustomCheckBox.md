# CustomCheckBox - Casilla de Verificación Personalizada para Android

## Descripción breve
`CustomCheckBox` es un componente Jetpack Compose que representa una casilla de verificación (CheckBox) con estilos visuales personalizados y animaciones para los estados de selección y presión. Ideal para formularios y listas donde se requiere una apariencia adaptada al diseño del producto.

## Características principales
- Estilos visuales personalizados según el tema de la marca.
- Animación en los estados de selección y presión.
- Personalización de tamaño, color y estado habilitado/deshabilitado.
- Integración sencilla en listas y formularios.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
import com.invex.one.uikit.components.buttons.CustomCheckBox

CustomCheckBox(
    checked = true,
    onCheckedChange = { isChecked -> /* Acción al cambiar selección */ },
    enabled = true
)
```

## Configuración y personalización
- `checked`: Estado actual de selección.
- `onCheckedChange`: Callback al cambiar el estado de selección.
- `enabled`: Habilita o deshabilita la interacción.
- `modifier`: Personalización de tamaño, padding, etc.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.foundation:foundation`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

