# MenuButton - Botón de Menú Simple para Android

## Descripción breve
`MenuButton` es un componente Jetpack Compose que representa un botón de menú simple con ícono y texto, permitiendo ejecutar una acción personalizada al hacer clic.

## Características principales
- Botón con ícono y texto alineados horizontalmente.
- Acción personalizada al hacer clic.
- Personalización de colores, estilos y tipografía.
- Integración sencilla en menús laterales y listas de opciones.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
MenuButton(
    icon = ImageVector.vectorResource(R.drawable.ic_settings),
    label = "Configuración",
    onClick = { /* Acción de configuración */ }
)
```

## Configuración y personalización
- `icon`: Ícono vectorial mostrado a la izquierda del texto.
- `label`: Texto descriptivo del ítem de menú.
- `onClick`: Acción al presionar el botón.
- Personalización de colores y estilos mediante temas.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

