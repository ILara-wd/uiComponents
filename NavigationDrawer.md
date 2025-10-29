# NavigationDrawer

Descripción: Componente para mostrar un cajón de navegación lateral con elementos de menú personalizables, útil para la navegación principal en aplicaciones Android.

## Ejemplo de uso
```kotlin
val menuItems = listOf(
    DrawerMenuItem(text = "Inicio", onClick = { /* Acción */ }),
    DrawerMenuItem(text = "Perfil", onClick = { /* Acción */ })
)
NavigationDrawer(menuItems = menuItems) { innerPadding ->
    // Contenido principal aquí
}
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.model.DrawerMenuItem
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.NavigationDrawer
   import com.invex.one.uikit.model.DrawerMenuItem
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

