# FooterMenuInfo - Pie de Menú Lateral para Android

## Descripción breve
`FooterMenuInfo` es un componente Jetpack Compose que muestra el pie de página del menú lateral, incluyendo logotipo, última sesión y versión de la app. Facilita la presentación de información relevante y branding en el menú hamburguesa.

## Características principales
- Muestra logotipo o imagen decorativa.
- Presenta información de última sesión y versión.
- Personalización de colores y estilos.
- Integración sencilla en menús laterales.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
FooterMenuInfo(
    lastLogin = "24/09/2025 10:30",
    version = "v1.2.3"
)
```

## Configuración y personalización
- `lastLogin`: Texto de última sesión.
- `version`: Texto de versión.
- Personalización de colores y estilos mediante temas.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

