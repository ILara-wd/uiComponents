# SkeletonLine

Descripción: Componente visual para mostrar una línea esquelética con efecto shimmer, útil para interfaces de carga en Android.

## Ejemplo de uso
```kotlin
SkeletonLine(
    fraction = 0.8f, // Fracción del ancho disponible
    shape = CircleShape, // Forma circular
    heightDp = 25 // Altura en dp
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.foundation
- androidx.compose.ui
- com.invex.one.uikit.commons.Constants
- shimmerEffect (animación propia)

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.skeleton.SkeletonLine
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

