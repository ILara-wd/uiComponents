# Voucher

Componente: Comprobante visual de transferencia exitosa en Android.

## Descripción breve
`Voucher` es un componente que muestra el comprobante de una operación financiera, incluyendo monto, destinatario, detalles de la transacción y un InfoBox opcional para información adicional. Permite personalización y se integra fácilmente en flujos de confirmación de pagos o transferencias.

## Características principales
- Visualización de ícono, monto, destinatario y nota informativa.
- Tarjeta con detalles clave-valor: concepto, número de tarjeta destino, cuenta destino, banco origen, cuenta origen, fecha/hora, referencia y clave.
- Soporte para detalles extra personalizados.
- InfoBox opcional para mostrar información adicional o acciones.
- Personalización de estilos y colores.

## Requisitos de instalación
- Android Studio Electric Eel o superior
- Kotlin 1.8+
- Jetpack Compose 1.4.0+
- Módulo `uikit` incluido en el proyecto

## Guía de uso
```kotlin
import com.invex.one.uikit.components.voucher.Voucher
import com.invex.one.uikit.components.voucher.VoucherInfo
import com.invex.one.uikit.components.voucher.VoucherDetail

@Composable
fun ExampleVoucher() {
    Voucher(
        voucherInfo = VoucherInfo(
            amount = "$1,000.00",
            recipient = "Juan Pérez",
            concept = "Pago de servicios",
            destinationCardNumber = "1234 5678 9012 3456",
            destination = "Cuenta BBVA",
            sourceBank = "BBVA",
            sourceAccount = "1234567890",
            dateTime = "24/09/2025 12:34",
            reference = "ABC123456",
            clave = "0000000112574750",
            showInfoBox = true,
            infoBoxTitle = "Información adicional",
            infoBoxDescription = "Este comprobante es válido solo para consulta.",
            infoBoxActionText = "Aceptar",
            infoBoxIcon = R.drawable.ic_info,
            showCloseIcon = true,
            extraDetails = listOf(
                VoucherDetail(title = "Banco origen", description = "BBVA")
            )
        ),
        onInfoBoxClose = {},
        onInfoBoxAction = {}
    )
}
```

## Configuración y personalización
- **voucherInfo**: Objeto con todos los datos del comprobante.
- **modifier**: Permite ajustar el diseño externo.
- **onInfoBoxClose**: Lambda para manejar el cierre del InfoBox.
- **onInfoBoxAction**: Lambda para manejar la acción del InfoBox.

Ejemplo de personalización:
```kotlin
Voucher(
    voucherInfo = customVoucherInfo,
    modifier = Modifier.padding(16.dp),
    onInfoBoxClose = { /* ... */ },
    onInfoBoxAction = { /* ... */ }
)
```

## Capturas de pantalla
*No aplica en este archivo, pero se recomienda agregar imágenes en la documentación principal del proyecto si es necesario.*

## Dependencias
- Jetpack Compose
- `uikit` (propio del proyecto)
- Recursos de dimensiones, colores y tipografía definidos en el módulo

## Licencia
Este componente se distribuye bajo la licencia MIT.

## Autor
- Irving Lara
- 24 de septiembre del 2025

