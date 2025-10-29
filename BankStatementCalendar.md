# BankStatementCalendar - Calendario de Estados de Cuenta para Android

## Descripción breve
`BankStatementCalendar` es un componente Jetpack Compose que permite visualizar y seleccionar periodos de estados de cuenta bancarios por año y mes. Ofrece una interfaz intuitiva para navegar entre años y seleccionar meses disponibles, integrando estados de carga, éxito y error.

## Características principales
- Visualización de años y meses disponibles para estados de cuenta.
- Navegación horizontal entre años y selección de meses activos.
- Soporte para estados de carga, éxito y error.
- Personalización de colores, estilos y callbacks.
- Integración sencilla en flujos de consulta de estados de cuenta.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso

### Implementación básica
```kotlin
import com.invex.one.uikit.components.calendar.BankStatementCalendar
import com.invex.one.uikit.components.calendar.model.Month
import com.invex.one.uikit.components.calendar.BankStatement
import com.invex.one.uikit.components.calendar.PeriodBankStatement

val periods = listOf(
    BankStatement(
        year = 2024,
        periods = listOf(
            PeriodBankStatement(Month.Octubre, "Oct", true),
            PeriodBankStatement(Month.Noviembre, "Nov", false),
            PeriodBankStatement(Month.Diciembre, "Dic", true)
        )
    )
)

BankStatementCalendar(
    bankStatements = periods,
    onPeriodClick = { year, period -> /* Acción al seleccionar periodo */ }
)
```

### Ejemplo con estados de carga y error
```kotlin
import com.invex.one.uikit.components.calendar.BankStatementCalendarState
import com.invex.one.uikit.components.skeleton.StateSkeleton

BankStatementCalendarState(
    context = context,
    periods = periods,
    state = StateSkeleton.Loading,
    onRetry = { /* Acción de reintento */ }
)
```

## Configuración y personalización
- `bankStatements`: Lista de años y periodos disponibles.
- `colorIndicator`: Color para el mes seleccionado.
- `colorText`: Color para textos activos.
- `onPeriodClick`: Callback al seleccionar un periodo.
- `onYearClicked`: Callback al seleccionar un año.
- Personalización de estilos mediante temas y recursos.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.foundation:foundation`
- `androidx.compose.ui:ui`
- `com.invex.one.uikit.components.skeleton`
- `com.invex.one.uikit.components.cards.CardRetry`
- `com.invex.one.uikit.components.label.SimpleLabel`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

