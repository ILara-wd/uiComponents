# OtpComponent

Componente Compose para ingreso de códigos OTP (One Time Password) con campos personalizables y validación.

## Características principales
- Soporte para 4-6 campos OTP.
- Validación automática y navegación entre campos.
- Personalización de error, obfuscación y estilos.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+
- Jetpack Compose

## Guía de uso
```kotlin
OtpComponent(
    config = OtpComponentConfig(noElements = 6, isError = false),
    onOtpComplete = { otp -> /* Acción con el OTP */ }
)
```

## Configuración y personalización
- Personaliza cantidad de campos, error, obfuscación y estilos:
```kotlin
OtpComponent(
    config = OtpComponentConfig(
        noElements = 4,
        isError = true,
        messageError = "Código incorrecto",
        errorIcon = R.drawable.ic_alert,
        enabled = true,
        resetOtp = false,
        isObfuscated = false,
        showObfuscationToggle = true
    ),
    onOtpComplete = { otp -> /* Validar OTP */ }
)
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

