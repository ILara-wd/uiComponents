# DeferCardComponent

Componente: Banner diferido con imagen y textos.

## Descripción breve
Muestra un banner con imagen a la izquierda y textos a la derecha, gestionando estados de carga, éxito y error.

## Características principales
- Imagen por URL o recurso drawable.
- Título y descripción personalizables.
- Estados visuales: loading, success, retry, failure.
- Integración con Jetpack Compose y Material3.

## Requisitos de instalación
- Kotlin >= 1.8
- Jetpack Compose >= 1.4.0
- AndroidX Material3

## Guía de uso
```kotlin
val params = ParamsDeferCard(
    title = "Título",
    body = "Descripción",
    imageUrl = "https://ejemplo.com/imagen.png"
)
DeferCardState(state = StateSkeleton.Success, params = params)
```

## Configuración y personalización
- `title`: Título del banner.
- `body`: Descripción.
- `imageRes` o `imageUrl`: Imagen a mostrar.
- `state`: Estado visual del banner.
- `onRetry`: Acción al reintentar en caso de error.

## Capturas de pantalla
*Agrega aquí una imagen si aplica*

## Dependencias
- androidx.compose.material3:material3
- androidx.compose.foundation

## Licencia
MIT

---
**Autor:** Irving Lara
**Fecha:** 30 de septiembre del 2025
# ExpandableCard

Componente: Card expandible con encabezado y contenido colapsable.

## Descripción breve
Permite mostrar información en una tarjeta que puede expandirse o colapsarse, mostrando un encabezado y un cuerpo composable.

## Características principales
- Encabezado con título y botón de expansión.
- Animación de rotación en el icono de despliegue.
- Personalización de color de fondo y callback de expansión.
- Uso de Jetpack Compose y Material3.

## Requisitos de instalación
- Kotlin >= 1.8
- Jetpack Compose >= 1.4.0
- AndroidX Material3

## Guía de uso
```kotlin
ExpandableCard(
    title = "Título de la tarjeta",
    body = {
        Text(text = "Contenido expandible")
    },
    containerColor = Color.White,
    onToggle = { expanded -> /* lógica */ }
)
```

## Configuración y personalización
- `title`: Título del encabezado.
- `body`: Composable con el contenido expandible.
- `containerColor`: Color de fondo de la tarjeta.
- `onToggle`: Callback opcional para manejar el estado de expansión.

## Capturas de pantalla
*Agrega aquí una imagen si aplica*

## Dependencias
- androidx.compose.material3:material3
- androidx.compose.foundation

## Licencia
MIT

---
**Autor:** Irving Lara
**Fecha:** 30 de septiembre del 2025

