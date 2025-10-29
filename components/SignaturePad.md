# SignaturePad

Componente para capturar firmas a mano alzada, exportar como imagen y compartir, diseñado para Jetpack Compose en Android.

## Características principales
- Captura de firma con gestos táctiles.
- Exportación de la firma como imagen (bitmap).
- Personalización de colores, textos y estilos.
- Botón para borrar y compartir la firma.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+
- Jetpack Compose

## Guía de uso
```kotlin
SignaturePad(
    modelSignature = ModelSignature(
        title = "Firma de autorización",
        description = "Por favor, firma en el recuadro.",
        textSecondaryButton = "Reintentar",
        textInfoDescription = "Tu firma será utilizada para validar la operación.",
        textPrimaryButton = "Enviar"
    )
)
```

## Configuración y personalización
- Modifica colores, textos y acciones:
```kotlin
SignaturePad(
    modelSignature = myModel,
    colorIndicator = Color.Blue,
    onInfoClick = { /* Mostrar información adicional */ }
)
```

## Dependencias
- implementation("androidx.compose.material3:material3:1.2.0")

## Instalación
1. Agrega la dependencia en tu archivo build.gradle.kts.
2. Importa el componente y úsalo en tu UI Compose.

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

