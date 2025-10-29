# LottieLoaderController

Controlador para mostrar y ocultar diálogos de loader con animaciones Lottie en Compose.

## Características principales
- Control programático de loaders Lottie.
- Soporte para mensajes y personalización visual.
- Integración con flujos de usuario y pantallas de carga.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+
- Jetpack Compose
- Lottie Compose

## Guía de uso
```kotlin
val loader = lottieLoaderController(isOneSpan = true, message = "Cargando...")
loader.show() // Muestra el loader
loader.hide() // Oculta el loader
```

## Configuración y personalización
- Personaliza el mensaje, el ícono y el recurso de animación:
```kotlin
val loader = lottieLoaderController(animationRes = R.raw.invex_one_now, message = "Procesando")
```

## Dependencias
- implementation("com.airbnb.android:lottie-compose:6.0.0")
- implementation("androidx.compose.ui:ui:1.2.0")

## Instalación
1. Agrega las dependencias en tu build.gradle.kts.
2. Usa el controlador en tu UI Compose.

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

