# WebViewPageComponent

Descripción: Componente para mostrar contenido web dentro de la aplicación Android usando WebView y Jetpack Compose. Permite cargar URLs, mostrar indicadores de carga y personalizar la experiencia de navegación.

## Ejemplo de uso
```kotlin
WebViewPageComponent(
    url = "https://invex.com",
    showProgress = true
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.ui.viewinterop.AndroidView
- android.webkit.WebView

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.WebViewPageComponent
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

