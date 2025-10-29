# AccountDetails - Detalle de Cuenta para Android

## Descripción breve
`AccountDetails` es un componente Jetpack Compose que muestra la información detallada de una cuenta bancaria, incluyendo nombre, número de cuenta, tipo y saldo. Permite personalizar el diseño y agregar acciones relacionadas con la cuenta.

## Características principales
- Visualización clara de los datos principales de la cuenta.
- Soporte para mostrar nombre, número, tipo y saldo.
- Personalización de estilos, colores y disposición.
- Integración sencilla en pantallas de detalle de cuenta o resumen financiero.
- Permite agregar acciones como transferir, consultar movimientos, etc.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
import com.invex.one.uikit.components.debitdetail.AccountDetails

AccountDetails(
    accountName = "Cuenta Nómina",
    accountNumber = "1234 5678 9012 3456",
    accountType = "Débito",
    balance = "$25,000.00",
    onTransferClick = { /* Acción de transferencia */ },
    onMovementsClick = { /* Acción de consultar movimientos */ }
)
```

## Configuración y personalización
- `accountName`: Nombre de la cuenta.
- `accountNumber`: Número de cuenta.
- `accountType`: Tipo de cuenta.
- `balance`: Saldo actual.
- `onTransferClick`: Acción al presionar el botón de transferencia.
- `onMovementsClick`: Acción al consultar movimientos.
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

