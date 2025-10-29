# SliderRangeControl

Componente: Control deslizante con divisiones y etiqueta flotante para selección de rango en Android.

## Descripción breve
`SliderRangeControl` permite seleccionar un valor dentro de un rango definido, mostrando divisiones visuales, una etiqueta flotante con el valor actual y personalización de colores. Ideal para interfaces financieras o de configuración.

## Características principales
- Slider horizontal con divisiones visuales (ticks).
- Etiqueta flotante con el valor actual.
- Personalización de colores activos/inactivos.
- Soporte para vista previa y valores iniciales.

## Requisitos de instalación
- Android Studio Electric Eel o superior
- Kotlin 1.8+
- Jetpack Compose 1.4.0+
- Módulo `uikit` incluido en el proyecto

## Guía de uso
```kotlin
import com.invex.one.uikit.components.slider.SliderRangeControl
import com.invex.one.uikit.components.slider.ModelSliderRange

@Composable
fun ExampleSliderRange() {
    SliderRangeControl(
        modelSliderRange = ModelSliderRange(
            minimumValue = 0,
            maximumValue = 10000,
            fractionsDivide = 5
        ),
        initialValue = 5000,
        onValueChange = { value ->
            // Manejar el valor seleccionado
        }
    )
}
```

## Configuración y personalización
- **modelSliderRange**: Define el rango y divisiones.
- **initialValue**: Valor inicial seleccionado.
- **colorActive**: Color para el estado activo.
- **colorInactive**: Color para el estado inactivo.
- **showTicks**: Mostrar/ocultar divisiones.
- **onValueChange**: Callback para cambios de valor.

Ejemplo de personalización:
```kotlin
SliderRangeControl(
    modelSliderRange = ModelSliderRange(0, 10000, 3),
    initialValue = 6666,
    colorActive = Color.Green,
    colorInactive = Color.Gray,
    showTicks = true,
    onValueChange = { value -> /* ... */ }
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

