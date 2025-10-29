# CustomTabComponent

Componente: Pestañas personalizadas con iconos y títulos para navegación en Android.

## Descripción breve
`CustomTabComponent` permite mostrar una interfaz de pestañas con títulos e iconos opcionales, facilitando la navegación entre diferentes secciones o vistas en una pantalla.

## Características principales
- Soporte para múltiples pestañas con títulos y/o iconos.
- Indicador visual para la pestaña seleccionada.
- Personalización de colores y estilos.
- Callback para manejar el cambio de pestaña.

## Requisitos de instalación
- Android Studio Electric Eel o superior
- Kotlin 1.8+
- Jetpack Compose 1.4.0+
- Módulo `uikit` incluido en el proyecto

## Guía de uso
```kotlin
import com.invex.one.uikit.components.tabs.CustomTabComponent
import com.invex.one.uikit.model.TabItem

val tabs = listOf(
    TabItem(title = "Tab 1", content = { /* Contenido Tab 1 */ }),
    TabItem(title = "Tab 2", icon = R.drawable.ic_card, content = { /* Contenido Tab 2 */ })
)

CustomTabComponent(tabs = tabs)
```

## Configuración y personalización
- **tabs**: Lista de objetos `TabItem` con título, icono y contenido.
- **selectedIndex**: Índice de la pestaña seleccionada al iniciar.
- **modifier**: Permite ajustar el diseño del componente.

Ejemplo de personalización:
```kotlin
CustomTabComponent(
    tabs = tabs,
    selectedIndex = 1,
    modifier = Modifier.padding(8.dp)
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

