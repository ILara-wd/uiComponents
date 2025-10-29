# LogoutButton - Botón de Cierre de Sesión para Android

## Descripción breve
`LogoutButton` es un componente Jetpack Compose que representa un botón para cerrar sesión en el menú lateral, mostrando ícono y texto alineados horizontalmente. Permite ejecutar una acción personalizada al hacer clic.

## Características principales
- Botón con ícono y texto.
- Acción personalizada al hacer clic.
- Personalización de colores y estilos.
- Integración sencilla en menús laterales.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
LogoutButton(onClick = { /* Acción de logout */ })
```

## Configuración y personalización
- `onClick`: Acción al presionar el botón.
- Personalización de colores, íconos y estilos mediante temas.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

