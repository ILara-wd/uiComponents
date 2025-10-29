# OffersCarousel

Componente Compose para mostrar un carrusel horizontal de ofertas con cards personalizadas.

## Características principales
- Carrusel horizontal con scroll y cards de oferta.
- Soporte para imágenes desde URL y recursos.
- Personalización de pill, título, subtítulo y colores.
- Opción de "Más Ofertas".

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+
- Jetpack Compose
- Coil v3 (para imágenes)

## Guía de uso
```kotlin
OffersCarousel(
    offers = listOf(
        OfferItem(
            pillText = "Popular",
            title = "Tarjeta Premium",
            subtitle = "Beneficios exclusivos",
            imageDrawable = R.drawable.ic_launcher
        )
    ),
    onOfferClick = { offer -> /* Acción al hacer clic */ },
    showMoreOffers = true,
    onMoreOffersClick = { /* Acción al hacer clic en más ofertas */ }
)
```

## Configuración y personalización
- Personaliza pill, colores, imágenes y acciones:
```kotlin
OfferItem(pillText = "Nuevo", title = "Programa 0%", subtitle = "Sin intereses", imageUrl = "https://ejemplo.com/imagen.png")
```

## Dependencias
- implementation("io.coil-kt:coil-compose:3.0.0")
- implementation("androidx.compose.ui:ui:1.2.0")

## Instalación
1. Agrega las dependencias en tu build.gradle.kts.
2. Usa el componente en tu UI Compose.

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

