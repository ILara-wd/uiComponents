# AccountDetailsItem - Ítem de Detalle de Cuenta para Android

## Descripción breve
`AccountDetailsItem` es un componente Jetpack Compose que representa un ítem individual dentro del detalle de una cuenta bancaria, mostrando información específica como concepto, monto, fecha o estado. Es ideal para listas de movimientos, cargos, abonos o detalles transaccionales.

## Características principales
- Visualización clara de información individual de la cuenta.
- Soporte para mostrar concepto, monto, fecha y estado.
- Personalización de estilos, colores y disposición.
- Integración sencilla en listas de movimientos o detalles de cuenta.
- Permite agregar acciones como ver más detalles, compartir, etc.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
import com.invex.one.uikit.components.debitdetail.AccountDetailsItem

AccountDetailsItem(
    concept = "Pago de servicios",
    amount = "$1,200.00",
    date = "24/09/2025",
    status = "Completado",
    onClick = { /* Acción al seleccionar el ítem */ }
)
```

## Configuración y personalización
- `concept`: Concepto o descripción del movimiento.
- `amount`: Monto del movimiento.
- `date`: Fecha de la transacción.
- `status`: Estado del movimiento.
- `onClick`: Acción al seleccionar el ítem.
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

