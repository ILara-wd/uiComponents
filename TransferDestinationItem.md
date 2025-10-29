# TransferDestinationItem - Componente de Destinatario de Transferencia para Android

## Descripción breve
`TransferDestinationItem` es un componente Jetpack Compose que muestra una fila con avatar de perfil e información del destinatario de una transferencia. Es ideal para interfaces de pagos o transferencias donde se necesita mostrar a quién se está transfiriendo el dinero, incluyendo nombre y banco.

## Características principales
- Muestra avatar de perfil personalizado (iniciales o imagen).
- Presenta nombre y banco/cuenta del destinatario.
- Personalización mediante `Modifier`.
- Integración sencilla en flujos de pago y transferencia.
- Compatible con temas y tipografías del proyecto.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso

```kotlin
import com.invex.one.uikit.components.bar.TransferDestinationItem
import com.invex.one.uikit.components.icon.Avatar
import androidx.compose.ui.res.stringResource
import com.invex.one.uikit.R

TransferDestinationItem(
    name = stringResource(R.string.transfer_name),
    bank = stringResource(R.string.transfer_bank),
    profileAvatar = {
        Avatar(initials = stringResource(R.string.transfer_initial))
    }
)
```

## Configuración y personalización
- `name`: Nombre del destinatario.
- `bank`: Texto del banco o cuenta.
- `profileAvatar`: Composable para el avatar (iniciales, imagen, etc.).
- `modifier`: Modificador Compose para tamaño, padding, etc.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- `com.invex.one.uikit.components.icon.Avatar`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

