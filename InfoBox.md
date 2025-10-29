# InfoBox

Componente para mostrar mensajes informativos en la interfaz de usuario, ideal para notificaciones, tips o estados.

## Características principales
- Visualización de mensajes informativos.
- Personalización de colores, iconos y estilos.
- Animaciones de entrada y salida.
- Integración sencilla en layouts.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+

## Guía de uso
```kotlin
val infoBox = InfoBox(context)
infoBox.show("Información importante")
```

## Configuración y personalización
- Cambia el color y el icono:
```kotlin
infoBox.setBackgroundColor(Color.BLUE)
infoBox.setIcon(R.drawable.ic_info)
```

## Dependencias
- implementation("androidx.core:core-ktx:1.12.0")

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025
# AlertBox

Componente para mostrar alertas visuales en la interfaz de usuario de Android, permitiendo informar al usuario sobre eventos importantes o advertencias.

## Características principales
- Personalización de colores y estilos.
- Soporte para diferentes tipos de alerta (éxito, error, advertencia, información).
- Animaciones de entrada y salida.
- Fácil integración en layouts existentes.

## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+
- Jetpack Compose (si aplica)

## Guía de uso
```kotlin
val alertBox = AlertBox(context)
alertBox.show("¡Atención!", "Este es un mensaje de alerta.")
```

## Configuración y personalización
- Puedes modificar el color de fondo, icono y texto:
```kotlin
alertBox.setType(AlertType.ERROR)
alertBox.setBackgroundColor(Color.RED)
alertBox.setIcon(R.drawable.ic_warning)
```

## Dependencias
- implementation("androidx.core:core-ktx:1.12.0")
- implementation("androidx.appcompat:appcompat:1.6.1")

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025

