# SwipeToDeleteContainer

Componente: Contenedor con funcionalidad de "deslizar para eliminar" en listas de Android.

## Descripción breve
`SwipeToDeleteContainer` permite envolver cualquier contenido para habilitar la acción de eliminar mediante un gesto de swipe. Ideal para listas interactivas donde el usuario puede eliminar elementos deslizando hacia la izquierda.

## Características principales
- Integración sencilla con cualquier contenido composable.
- Callback para manejar la acción de eliminación.
- Personalización mediante `Modifier`.
- Soporte para identificador de contenido.

## Requisitos de instalación
- Android Studio Electric Eel o superior
- Kotlin 1.8+
- Jetpack Compose 1.4.0+
- Módulo `uikit` incluido en el proyecto

## Guía de uso
```kotlin
import com.invex.one.uikit.components.swipe.SwipeToDeleteContainer

@Composable
fun ExampleSwipeToDelete() {
    SwipeToDeleteContainer(
        contentIdentifier = "item1",
        onDelete = { id -> /* Manejar eliminación */ },
        content = {
            // Tu contenido aquí
        }
    )
}
```

## Configuración y personalización
- **modifier**: Permite ajustar el diseño del contenedor.
- **onDelete**: Callback que recibe el identificador del contenido eliminado.
- **contentIdentifier**: Identificador único para el contenido.
- **content**: Composable que representa el contenido a mostrar.

Ejemplo de personalización:
```kotlin
SwipeToDeleteContainer(
    modifier = Modifier.padding(8.dp),
    contentIdentifier = "item2",
    onDelete = { id -> /* ... */ },
    content = { /* ... */ }
)
```

## Capturas de pantalla
*No aplica en este archivo, pero se recomienda agregar imágenes en la documentación principal del proyecto si es necesario.*

## Dependencias
- Jetpack Compose
- `uikit` (propio del proyecto)
- Recursos de dimensiones y colores definidos en el módulo

## Licencia
Este componente se distribuye bajo la licencia MIT.

## Autor
- Irving Lara
- 24 de septiembre del 2025

