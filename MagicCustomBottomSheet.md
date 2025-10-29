# MagicCustomBottomSheet - Hoja Inferior Personalizada para Android

## Descripción breve
`MagicCustomBottomSheet` es un componente Jetpack Compose que muestra una hoja inferior modal con bordes redondeados y diseño personalizable. Permite mostrar cualquier contenido composable y gestionar el cierre mediante callback.

## Características principales
- Presenta una hoja inferior modal (`ModalBottomSheet`).
- Bordes superiores redondeados y padding configurable.
- Permite mostrar cualquier contenido composable.
- Callback para gestionar el cierre de la hoja.
- Integración sencilla en flujos de UI.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso

```kotlin
import com.invex.one.uikit.components.bottomSheet.MagicCustomBottomSheet

var showSheet by remember { mutableStateOf(false) }

MagicCustomBottomSheet(
    visible = showSheet,
    body = {
        Text("Contenido de la hoja inferior")
        Button(onClick = { showSheet = false }) {
            Text("Cerrar")
        }
    },
    onDismiss = { showSheet = false }
)
```

## Configuración y personalización
- `visible`: Controla la visibilidad de la hoja inferior.
- `body`: Composable con el contenido a mostrar.
- `onDismiss`: Callback al cerrar la hoja.
- Bordes redondeados y padding configurables mediante recursos.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- `kotlinx.coroutines:coroutines-core`
- Recursos internos del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

