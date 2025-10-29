# TextBlock

Componente: Bloque de contenido informativo con título, descripción, ícono y botones en Android.

## Descripción breve
`TextBlock` permite mostrar un bloque de contenido con fondo blanco, ideal para mensajes informativos, alertas o secciones destacadas. Soporta ícono personalizado, título, descripción y hasta dos botones opcionales.

## Características principales
- Fondo blanco con esquinas redondeadas.
- Soporte para ícono o gráfico personalizado en la parte superior.
- Título obligatorio y descripción opcional.
- Hasta dos botones opcionales debajo del contenido.
- Personalización mediante `Modifier`.

## Requisitos de instalación
- Android Studio Electric Eel o superior
- Kotlin 1.8+
- Jetpack Compose 1.4.0+
- Módulo `uikit` incluido en el proyecto

## Guía de uso
```kotlin
import com.invex.one.uikit.components.text.TextBlock

@Composable
fun ExampleTextBlock() {
    TextBlock(
        title = "Título del bloque",
        description = "Descripción opcional",
        firstButton = { /* Botón principal */ },
        secondButton = { /* Botón secundario */ }
    )
}
```

## Configuración y personalización
- **iconCustom**: Composable opcional para ícono o gráfico superior.
- **title**: Título del bloque.
- **description**: Descripción opcional.
- **firstButton**: Composable opcional para el primer botón.
- **secondButton**: Composable opcional para el segundo botón.
- **modifier**: Permite ajustar el diseño externo.

Ejemplo de personalización:
```kotlin
TextBlock(
    iconCustom = { /* Ícono personalizado */ },
    title = "Alerta",
    description = "Mensaje importante",
    firstButton = { /* ... */ },
    secondButton = { /* ... */ }
)
```

## Capturas de pantalla
*No aplica en este archivo, pero se recomienda agregar imágenes en la documentación principal del proyecto si es necesario.*

## Dependencias
- Jetpack Compose
- `uikit` (propio del proyecto)

## Licencia
Este componente se distribuye bajo la licencia MIT.

## Autor
- Irving Lara
- 24 de septiembre del 2025

