# TextIcon

Componente: Texto con íconos opcionales a la izquierda y/o derecha para interfaces Android.

## Descripción breve
`TextIcon` permite mostrar texto acompañado de íconos opcionales a la izquierda y/o derecha, ideal para etiquetas, botones o elementos informativos con representación gráfica.

## Características principales
- Soporte para ícono a la izquierda y/o derecha del texto.
- Personalización de color, tamaño, estilo y alineación del texto.
- Fácil integración en layouts Compose.
- Configuración flexible mediante objeto `ConfigTextIcon`.

## Requisitos de instalación
- Android Studio Electric Eel o superior
- Kotlin 1.8+
- Jetpack Compose 1.4.0+
- Módulo `uikit` incluido en el proyecto

## Guía de uso
```kotlin
import com.invex.one.uikit.components.text.TextIcon
import com.invex.one.uikit.components.text.ConfigTextIcon

@Composable
fun ExampleTextIcon() {
    TextIcon(
        configTextIcon = ConfigTextIcon(
            text = "Ejemplo",
            color = Color.Black,
            fontSize = 16.sp
        ),
        leadingIcon = { Icon(Icons.Default.DarkMode, contentDescription = null) },
        trailingIcon = { Icon(Icons.Default.DarkMode, contentDescription = null) }
    )
}
```

## Configuración y personalización
- **configTextIcon**: Configuración de texto, color, tamaño, estilo, alineación y peso.
- **leadingIcon**: Composable opcional para ícono a la izquierda.
- **trailingIcon**: Composable opcional para ícono a la derecha.
- **modifier**: Permite ajustar el diseño externo.

Ejemplo de personalización:
```kotlin
TextIcon(
    configTextIcon = ConfigTextIcon(
        text = "Alerta",
        color = Color.Red,
        fontWeight = FontWeight.Bold
    ),
    leadingIcon = { Icon(Icons.Default.Warning, contentDescription = null) }
)
```

## Capturas de pantalla
*No aplica en este archivo, pero se recomienda agregar imágenes en la documentación principal del proyecto si es necesario.*

## Dependencias
- Jetpack Compose
- `uikit` (propio del proyecto)

## Licencia
Este componente se distribuye bajo la licencia MIT.

## Autor
- Irving Lara
- 24 de septiembre del 2025

