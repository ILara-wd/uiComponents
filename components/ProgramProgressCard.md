# ProgramProgressCard

Componente: Tarjeta de progreso de programa de lealtad.

## Descripción breve
Muestra el avance de un usuario dentro de un programa de recompensas, incluyendo barra de progreso, metas y detalles relevantes.

## Características principales
- Visualización de progreso con barra animada.
- Muestra metas alcanzadas y próximas.
- Personalización de colores y textos.
- Integración con Jetpack Compose y Material3.

## Requisitos de instalación
- Kotlin >= 1.8
- Jetpack Compose >= 1.4.0
- AndroidX Material3

## Guía de uso
```kotlin
ProgramProgressCard(
    progress = 0.65f,
    goal = "Gasta $10,000 para el siguiente nivel",
    currentLevel = "Nivel Oro",
    nextLevel = "Nivel Platino",
    modifier = Modifier.fillMaxWidth()
)
```

## Configuración y personalización
- `progress`: Valor de avance (0.0 a 1.0).
- `goal`: Texto de meta próxima.
- `currentLevel`: Nivel actual del usuario.
- `nextLevel`: Siguiente nivel a alcanzar.
- `modifier`: Modificador Compose para tamaño y posición.
- `progressColor`: Color de la barra de progreso.

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

