# LottieLoader

Componente para mostrar animaciones Lottie como loader en Compose, con soporte para mensajes y personalización visual.

## Características principales
- Animación Lottie centralizada.
- Mensaje opcional y soporte para íconos adicionales.
- Integración con diálogos y pantallas de carga.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+
- Jetpack Compose
- Lottie Compose

## Guía de uso
```kotlin
LottieLoader(
    isOneSpan = true,
    animationRes = R.raw.invex_one_one,
    message = "Cargando..."
)
```

## Configuración y personalización
- Cambia el recurso de animación, el mensaje y el ícono:
```kotlin
LottieLoader(isOneSpan = false, animationRes = R.raw.invex_one_now, message = "Procesando datos")
```

## Dependencias
- implementation("com.airbnb.android:lottie-compose:6.0.0")
- implementation("androidx.compose.ui:ui:1.2.0")

## Instalación
1. Agrega las dependencias en tu build.gradle.kts.
2. Usa el componente en tu UI Compose.

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

