# MiniBannersBenefits - Mini Banner de Beneficios para Android

## Descripción breve
`MiniBannersBenefits` es un componente Jetpack Compose que muestra banners compactos con título, botón de acción e ícono o imagen. Ideal para resaltar promociones, accesos rápidos o beneficios en formato de cuadrícula.

## Características principales
- Presenta título y botón de acción en formato compacto.
- Soporte para ícono o imagen personalizada.
- Personalización de colores y estilos.
- Integración en cuadrícula (`LazyVerticalGrid`).
- Fácil manejo de acciones al tocar el botón.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso

```kotlin
import com.invex.one.uikit.components.banner.MiniBannersBenefits

MiniBannersBenefits(
    title = "Promoción especial",
    textButton = "Ver todo",
    icon = R.drawable.ic_promocion,
    callToAction = { /* Acción al tocar el botón */ }
)
```

### Ejemplo en cuadrícula
```kotlin
LazyVerticalGrid(columns = GridCells.Fixed(2)) {
    items(banners) { banner ->
        MiniBannersBenefits(
            title = banner.title,
            textButton = banner.textButton,
            icon = banner.icon,
            callToAction = { /* Acción personalizada */ }
        )
    }
}
```

## Configuración y personalización
- `title`: Título del mini banner.
- `textButton`: Texto del botón de acción.
- `icon` o `imageUrl`: Ícono o imagen personalizada.
- `textColorButton`, `textTitleButton`: Personalización de colores.
- `callToAction`: Acción al tocar el botón.
- `modifier`: Modificador Compose para tamaño, padding, etc.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

