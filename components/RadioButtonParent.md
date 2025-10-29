# RadioButtonParent - Grupo de Botones de Opción para Android

## Descripción breve
`RadioButtonParent` es un componente Jetpack Compose que permite agrupar y gestionar múltiples botones de opción (RadioButton), facilitando la selección exclusiva en listas o formularios.

## Características principales
- Gestión de selección exclusiva entre múltiples opciones.
- Integración sencilla con `CustomRadioButton` y otros radio buttons.
- Personalización de disposición, estilos y acciones.
- Callback para manejar el cambio de selección.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
import com.invex.one.uikit.components.buttons.RadioButtonParent

val options = listOf("Opción 1", "Opción 2", "Opción 3")
var selectedIndex by remember { mutableStateOf(0) }

RadioButtonParent(
    options = options,
    selectedIndex = selectedIndex,
    onOptionSelected = { index -> selectedIndex = index }
)
```

## Configuración y personalización
- `options`: Lista de opciones a mostrar.
- `selectedIndex`: Índice de la opción seleccionada.
- `onOptionSelected`: Callback al cambiar la selección.
- Personalización de disposición y estilos mediante temas.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

