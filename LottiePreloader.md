# LottiePreloader - Componente de Animación Lottie para Pre-carga en Android

## Descripción breve
`LottiePreloader` es un componente Jetpack Compose que permite mostrar animaciones Lottie como pre-cargadores en aplicaciones Android. Facilita la integración de archivos `.json` de Lottie para mejorar la experiencia de usuario durante procesos de carga o espera.

## Características principales
- Renderiza animaciones Lottie desde recursos raw.
- Personalización mediante `Modifier` para tamaño, padding y otros estilos.
- Fácil integración en cualquier jerarquía Compose.
- Soporte para múltiples animaciones y vista previa en grid.
- Tag de test para pruebas automatizadas.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+
- Dependencia de Lottie Compose:
    ```groovy
    implementation "com.airbnb.android:lottie-compose:6.0.0"
    ```

## Guía de uso

### 1. Agregar archivo Lottie (.json)
Coloca tu archivo de animación Lottie en el directorio `res/raw` de tu módulo Android.

### 2. Implementación básica
```kotlin
import com.invex.one.uikit.components.animation.LottiePreloader

LottiePreloader(
    modifier = Modifier.size(100.dp),
    lottieFiles = R.raw.loader_animation
)
```

### 3. Vista previa con múltiples animaciones
```kotlin
@Preview
@Composable
fun LottiePreloaderPreview() {
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(2),
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(dimensionResource(id = R.dimen.padding_ui_16dp)),
        verticalItemSpacing = dimensionResource(id = R.dimen.padding_ui_16dp),
        horizontalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_ui_16dp))
    ) {
        item {
            LottiePreloader(lottieFiles = R.raw.camera, modifier = Modifier.size(100.dp))
        }
        // ...otros items
    }
}
```

## Configuración y personalización
- `modifier`: Permite ajustar tamaño, padding, alineación, etc.
- `lottieFiles`: ID del recurso raw del archivo Lottie (`.json`).
- Tag de test: `LottiePreloaderDefaults.ANIMATION_TAG` para pruebas automatizadas.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `com.airbnb.android:lottie-compose:6.0.0`
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Recursos Lottie en `res/raw`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

