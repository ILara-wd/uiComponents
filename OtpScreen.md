# OtpScreen

Pantalla Compose para flujos de ingreso de código OTP, con temporizador, botón de reenvío y validación.

## Características principales
- Título, subtítulo y temporizador de cuenta regresiva.
- Componente OTP integrado y botón de reenvío.
- Personalización de textos, errores y cantidad de campos.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+
- Jetpack Compose

## Guía de uso
```kotlin
OtpScreen(
    otpScreenParams = OtpScreenParams(
        title = "Verifica tu identidad",
        subTitle = "Ingresa el código enviado",
        buttonReSendCode = "Reenviar código",
        errorOtpMessage = "Código incorrecto",
        countdownOtp = 60,
        noElements = 6
    ),
    onComplete = { otp -> /* Validar OTP */ },
    onResend = { /* Reenviar código */ },
    isResendEnabled = true
)
```

## Configuración y personalización
- Personaliza textos, temporizador y cantidad de campos OTP:
```kotlin
OtpScreen(
    otpScreenParams = OtpScreenParams(
        title = "Autenticación",
        subTitle = "Por favor ingresa el código",
        buttonReSendCode = "Reenviar",
        errorOtpMessage = "OTP inválido",
        countdownOtp = 120,
        noElements = 4
    ),
    isResendEnabled = false
)
```

## Dependencias
- implementation("androidx.compose.ui:ui:1.2.0")

## Instalación
1. Agrega la dependencia en tu build.gradle.kts.
2. Usa la pantalla en tu flujo Compose.

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

