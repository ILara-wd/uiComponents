# SwipeDeleteBackground

Componente: Fondo visual para acciones de eliminación mediante swipe en Android.

## Descripción breve
`SwipeDeleteBackground` es un fondo rojo con ícono de papelera, diseñado para usarse en listas donde los elementos pueden ser eliminados mediante un gesto de swipe.

## Características principales
- Fondo rojo con ícono de papelera alineado a la derecha.
- Fácil integración con gestos de swipe en listas.
- Personalización mediante `Modifier`.

## Requisitos de instalación
- Android Studio Electric Eel o superior
- Kotlin 1.8+
- Jetpack Compose 1.4.0+
- Módulo `uikit` incluido en el proyecto

## Guía de uso
```kotlin
import com.invex.one.uikit.components.swipe.SwipeDeleteBackground

@Composable
fun ExampleSwipeDeleteBackground() {
    SwipeDeleteBackground()
}
```

## Configuración y personalización
- **modifier**: Permite ajustar el tamaño, padding y disposición del fondo.

Ejemplo de personalización:
```kotlin
SwipeDeleteBackground(modifier = Modifier.padding(8.dp))
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

