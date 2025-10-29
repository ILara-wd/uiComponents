# BannersBenefits - Banner de Beneficios para Android

## Descripción breve
`BannersBenefits` es un componente de Jetpack Compose que muestra banners informativos sobre beneficios, con opción de imagen o ícono, botón de acción y cierre. Permite gestionar estados de carga, éxito y error, y se integra fácilmente en carruseles horizontales.

## Características principales
- Presenta título, descripción y botón de acción.
- Soporte para imagen o ícono personalizado.
- Opción de botón de cierre.
- Gestión de estados: carga, éxito, error y reintento.
- Personalización de colores y textos.
- Integración en carrusel horizontal (`LazyRow`).

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso

```kotlin
import com.invex.one.uikit.components.banner.BannersBenefits
import com.invex.one.uikit.components.banner.ParamsBannerBenefits

BannersBenefits(
    callToAction = { /* Acción del botón */ },
    callToActionBanner = { /* Acción al tocar el banner */ },
    closeAction = { /* Acción al cerrar */ },
    icon = R.drawable.ic_pago22x1000,
    paramsBannerBenefits = ParamsBannerBenefits(
        title = "Título del beneficio",
        body = "Descripción del beneficio",
        textButton = "Ver más",
        titleColor = Color.Black,
        bodyColor = Color.Gray,
        buttonColor = Color.Blue
    )
)
```

### Ejemplo de carrusel de banners
```kotlin
BannersBenefitsState(
    banner = listOf(/* Lista de BannersBenefitsModel */),
    state = StateSkeleton.Success,
    callToAction = { /* Acción del botón */ },
    callToActionBanner = { /* Acción al tocar el banner */ },
    closeAction = { /* Acción al cerrar */ }
)
```

## Configuración y personalización
- `ParamsBannerBenefits`: Configura título, descripción, colores y texto del botón.
- `icon` o `imageUrl`: Personaliza el ícono o imagen del banner.
- `callToAction`, `callToActionBanner`, `closeAction`: Define acciones personalizadas.
- `modifier`: Modificador Compose para tamaño, padding, etc.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

