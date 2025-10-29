# PullRefreshDemo

Componente: Demostración de "pull to refresh" en listas con Jetpack Compose y Material3.

## Descripción breve
`PullRefreshDemo` es un componente demostrativo que implementa la funcionalidad de "pull to refresh" en listas, mostrando estados de carga, éxito y error, con integración de tarjetas y skeleton loaders. Facilita la actualización de datos en interfaces modernas de Android.

## Características principales
- Integración con `PullToRefreshBox` de Material3.
- Indicador animado de progreso y estado.
- Soporte para estados de carga, éxito y error.
- Ejemplo de uso con tarjetas, skeleton loaders y manejo de errores.
- Fácil integración en cualquier pantalla Compose.

## Requisitos de instalación
- Android Studio Electric Eel o superior
- Kotlin 1.8+
- Jetpack Compose 1.4.0+
- Material3 y módulo `uikit` incluidos en el proyecto

## Guía de uso
```kotlin
import com.invex.one.uikit.components.viewers.PullRefreshDemo

@Composable
fun MyScreen() {
    PullRefreshDemo()
}
```

## Configuración y personalización
- El componente puede adaptarse para mostrar diferentes contenidos en los estados de éxito, error y carga.
- Personaliza el contenido de las tarjetas y los loaders según tus necesidades.
- Modifica los valores de retardo y animación para ajustar la experiencia de usuario.

## Capturas de pantalla
*No aplica en este archivo, pero se recomienda agregar imágenes en la documentación principal del proyecto si es necesario.*

## Dependencias
- Jetpack Compose
- Material3
- kotlinx.coroutines
- `uikit` (propio del proyecto)

## Licencia
Este componente se distribuye bajo la licencia MIT.

## Autor
- Irving Lara
- 24 de septiembre del 2025

