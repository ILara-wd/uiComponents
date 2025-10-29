# CustomRadioButton - Botón de Opción Personalizado para Android

## Descripción breve
`CustomRadioButton` es un componente Jetpack Compose que representa un botón de opción (RadioButton) con estilos visuales personalizados y comportamiento enriquecido para estados de enfoque, selección y presión. Ideal para interfaces que requieren una apariencia adaptada al diseño del producto.

## Características principales
- Estilos visuales personalizados según el tema de la marca.
- Comportamiento enriquecido para estados de enfoque, selección y presión.
- Fondo animado en estados de interacción.
- Personalización de tamaño, color y estado habilitado/deshabilitado.
- Integración sencilla en listas y formularios.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso

```kotlin
import com.invex.one.uikit.components.buttons.CustomRadioButton

CustomRadioButton(
    initialSelected = true,
    onSelectedChange = { isSelected -> /* Acción al cambiar selección */ },
    enabled = true
)
```

### Ejemplo en lista
```kotlin
Column {
    CustomRadioButton(initialSelected = true, onSelectedChange = {})
    CustomRadioButton(initialSelected = false, onSelectedChange = {})
}
```

## Configuración y personalización
- `modifier`: Personalización de tamaño, padding, etc.
- `initialSelected`: Estado inicial de selección.
- `onSelectedChange`: Callback al cambiar el estado de selección.
- `enabled`: Habilita o deshabilita la interacción.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.foundation:foundation`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

