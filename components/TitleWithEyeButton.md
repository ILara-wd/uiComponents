# TitleWithEyeButton

Descripción: Componente que muestra un título con un botón de ícono de ojo para alternar la visibilidad de datos, útil para secciones de datos sensibles o personales en Android.

## Ejemplo de uso
```kotlin
TitleWithEyeButton(
    title = "Datos personales",
    isDataVisible = true,
    onEyeClick = { /* Alternar visibilidad */ }
) {
    // Contenido adicional debajo del título
}
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.TitleWithEyeButton
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

