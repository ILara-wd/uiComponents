# ContainerSkeleton

Componente Compose para mostrar contenido en diferentes estados (Cargando, Éxito, Fallo, Reintentar) con animación de esqueleto.

## Características principales
- Gestión de estados: Loading, Success, Failure, Retry.
- Animación tipo skeleton para carga de datos.
- Personalización de contenido para cada estado.
- Integración con flujos de datos y ViewModels.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+
- Jetpack Compose

## Guía de uso
```kotlin
ContainerSkeleton(
    stateSkeleton = StateSkeleton.Loading,
    contentLoading = { SkeletonPromotion() },
    contentSuccess = { /* contenido */ },
    contentFailure = { /* contenido de error */ },
    contentFaultRetried = { /* contenido de reintento */ }
)
```

## Configuración y personalización
- Personaliza el contenido de cada estado usando los parámetros `contentLoading`, `contentSuccess`, `contentFailure` y `contentFaultRetried`.

## Dependencias
- implementation("androidx.compose.ui:ui:1.2.0")

## Instalación
1. Agrega la dependencia en tu archivo build.gradle.kts.
2. Importa el componente y úsalo en tu UI Compose.

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

