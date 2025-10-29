# CheckboxParent - Componente de Checkbox Padre para Android

## Descripción breve
`CheckboxParent` es un componente Jetpack Compose que permite gestionar un grupo de checkboxes hijos bajo un checkbox padre con estado tri-state (On, Off, Indeterminate). Facilita la selección múltiple y sincronizada de elementos en listas o formularios.

## Características principales
- Checkbox padre con estado tri-state (On, Off, Indeterminate).
- Sincronización automática de selección entre padre e hijos.
- Personalización de contenido de cada checkbox hijo.
- Integración sencilla en listas y formularios.
- Soporte para vista previa y temas personalizados.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso
```kotlin
import com.invex.one.uikit.components.checkbox.CheckboxParent

CheckboxParent(
    title = "Seleccionar todo"
) {
    // Contenido personalizado para cada checkbox hijo
    Text("Elemento 1")
}
```

### Ejemplo avanzado con contenido personalizado
```kotlin
CheckboxParent(
    title = "Seleccionar todo"
) {
    ItemRowCard(
        content = ItemRowContent(
            title = "Farfetch",
            sub = "27/02/2024",
            valueText = "$24,000",
            valueSubtitle = "En tránsito",
            valueSubtitleColor = Color.Blue,
            isMovementsCard = true
        )
    )
}
```

## Configuración y personalización
- `title`: Título del checkbox padre.
- `content`: Composable para el contenido de cada checkbox hijo.
- Personalización de estilos, colores y tipografía mediante temas.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.foundation:foundation`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

