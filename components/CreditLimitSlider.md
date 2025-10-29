# CreditLimitSlider

Componente personalizado para seleccionar límites de crédito mediante un slider interactivo en Android.

## Descripción breve
`CreditLimitSlider` permite al usuario seleccionar un valor dentro de un rango definido, mostrando etiquetas para los valores mínimo y máximo. El diseño es adaptable y utiliza Jetpack Compose.

## Características principales
- Slider horizontal con track y thumb personalizados.
- Etiquetas para valores mínimo y máximo.
- Fácil integración en layouts Compose.
- Soporte para vista previa.

## Requisitos de instalación
- Android Studio Electric Eel o superior
- Kotlin 1.8+
- Jetpack Compose 1.4.0+
- Módulo `uikit` incluido en el proyecto

## Guía de uso
```kotlin
import com.invex.one.uikit.components.slider.CreditLimitSlider

@Composable
fun ExampleCreditLimitSlider() {
    CreditLimitSlider(
        minText = "Mínimo $1,000",
        maxText = "Máximo $10,000"
    )
}
```

## Configuración y personalización
- **minText**: Etiqueta para el valor mínimo.
- **maxText**: Etiqueta para el valor máximo.
- **modifier**: Modificador Compose para personalizar el diseño.

Ejemplo de personalización:
```kotlin
CreditLimitSlider(
    modifier = Modifier.padding(16.dp),
    minText = "Desde $1,000",
    maxText = "Hasta $10,000"
)
```

## Capturas de pantalla
*No aplica en este archivo, pero se recomienda agregar imágenes en la documentación principal del proyecto si es necesario.*

## Dependencias
- Jetpack Compose
- `uikit` (propio del proyecto)
- Recursos de dimensiones y colores definidos en el módulo

## Licencia
Este componente se distribuye bajo la licencia MIT.

## Autor
- Irving Lara
- 24 de septiembre del 2025

