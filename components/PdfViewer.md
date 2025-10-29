# PdfViewer

Componente Compose para visualizar archivos PDF desde URL, URI o assets, renderizando cada página como imagen.

## Características principales
- Visualización de PDFs desde múltiples fuentes.
- Renderizado de cada página como imagen.
- Loader y manejo de errores con opción de reintentar.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+
- Jetpack Compose

## Guía de uso
```kotlin
PdfViewer(
    pdfViewerResources = PdfViewerResources(url = "https://ejemplo.com/archivo.pdf"),
    messageErrorLoad = "Error al cargar PDF",
    onClickRetry = { /* Reintentar carga */ }
)
```

## Configuración y personalización
- Puedes cargar PDFs desde URL, URI o assets:
```kotlin
PdfViewer(pdfViewerResources = PdfViewerResources(assetFileName = "ejemplo.pdf"))
```

## Dependencias
- implementation("androidx.compose.ui:ui:1.2.0")

## Instalación
1. Agrega la dependencia en tu build.gradle.kts.
2. Usa el componente en tu UI Compose.

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025
# AsyncImageComponent

Componente Compose para cargar y mostrar imágenes de múltiples fuentes (URL, Base64, Bitmap, assets, recursos drawable) usando Coil.

## Características principales
- Soporte para imágenes desde URL, Base64, Bitmap, assets y recursos.
- Personalización de escala, transparencia y filtro de color.
- Fácil integración en layouts Compose.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+
- Jetpack Compose
- Coil v3

## Guía de uso
```kotlin
AsyncImageComponent(
    imageResources = ImageResources(url = "https://ejemplo.com/imagen.png"),
    modifier = Modifier.fillMaxWidth().height(200.dp),
    contentDescription = "Imagen de ejemplo"
)
```

## Configuración y personalización
- Puedes ajustar el tipo de fuente de imagen, escala, transparencia y filtro de color:
```kotlin
AsyncImageComponent(
    imageResources = ImageResources(resourceId = R.drawable.ic_launcher),
    contentScale = ContentScale.Crop,
    alpha = 0.8f,
    colorFilter = ColorFilter.tint(Color.Red)
)
```

## Dependencias
- implementation("io.coil-kt:coil-compose:3.0.0")
- implementation("androidx.compose.ui:ui:1.2.0")

## Instalación
1. Agrega las dependencias en tu archivo build.gradle.kts.
2. Importa el componente y úsalo en tu UI Compose.

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

