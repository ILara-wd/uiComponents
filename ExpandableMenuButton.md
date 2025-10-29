# ExpandableMenuButton - Botón de Menú Expandible para Android

## Descripción breve
`ExpandableMenuButton` es un componente Jetpack Compose que representa un botón de menú lateral con capacidad de expandir y mostrar subítems. Permite organizar opciones de navegación en grupos desplegables, mejorando la experiencia de usuario en menús complejos.

## Características principales
- Botón de menú con ícono y texto principal.
- Expansión animada para mostrar subítems.
- Soporte para múltiples subítems con acciones personalizadas.
- Cambio de ícono de flecha según estado (expandido/colapsado).
- Integración sencilla en menús laterales (`MenuList`).

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso

```kotlin
ExpandableMenuButton(
    expandableItem = ExpandableMenuItem(
        label = R.string.menu_help_center,
        icon = ImageVector.vectorResource(R.drawable.ic_info),
        subItems = listOf(
            MenuItem(R.string.menu_faq, icon) { /* Acción FAQ */ },
            MenuItem(R.string.menu_contact, icon) { /* Acción Contacto */ }
        )
    )
)
```

## Configuración y personalización
- `expandableItem`: Modelo con etiqueta, ícono y lista de subítems.
- Personalización de íconos, colores y estilos mediante temas.
- Acciones personalizadas por subítem.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

