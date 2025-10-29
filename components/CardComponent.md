# CardComponent

Descripción: Componente base reutilizable que representa una tarjeta con título, contenido personalizado y acciones opcionales. Ideal para encapsular información con estructura clara y estilo consistente en interfaces Android.

## Ejemplo de uso
```kotlin
CardComponent(
    title = "Mi tarjeta",
    content = { Text("Contenido de la tarjeta") },
    actions = {
        // Botones o acciones aquí
    }
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- androidx.compose.foundation.layout
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.cards.CardComponent
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

