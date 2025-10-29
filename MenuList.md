# MenuList - Lista de Opciones de Menú Lateral para Android

## Descripción breve
`MenuList` es un componente Jetpack Compose que representa la lista completa de opciones del menú lateral, incluyendo ítems simples, expandibles, botón de logout y pie de menú con información adicional.

## Características principales
- Renderiza lista de ítems de menú (simples y expandibles).
- Incluye separadores entre ítems.
- Espacio flexible para disposición vertical.
- Botón de logout integrado.
- Pie de menú con última sesión y versión.
- Personalización de layout y espaciado.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
MenuList(
    menuItems = menuItems,
    lastLogin = "24/09/2025 10:30",
    version = "v1.2.3",
    onLogoutClick = { /* Acción de logout */ },
    paddingValues = PaddingValues(0.dp)
)
```

## Configuración y personalización
- `menuItems`: Lista de ítems del menú (`BaseMenuItem`).
- `lastLogin`: Texto de última sesión.
- `version`: Texto de versión.
- `onLogoutClick`: Acción al presionar el botón de logout.
- `paddingValues`: Espaciado interno del menú.
- Personalización de layout y estilos mediante temas.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

