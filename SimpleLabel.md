# Componentes de Etiqueta para Android

Este módulo contiene componentes de UI para mostrar texto en aplicaciones Android usando Jetpack Compose. Incluye `SimpleLabel` para etiquetas simples y personalizables.

## SimpleLabel

### Descripción breve
Componente para mostrar texto simple, con opción de transformación visual y peso tipográfico personalizado. Útil para etiquetas, valores o información estática.

### Características principales
- Permite aplicar negrita opcionalmente.
- Soporte para transformación visual (ejemplo: máscaras).
- Personalización de color, alineación y estilo.
- Integración sencilla con Jetpack Compose.

### Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

### Guía de uso

```kotlin
import com.invex.one.uikit.components.label.SimpleLabel

SimpleLabel(
    text = "12031990",
    color = Color.Black,
    isBoldText = true
)
```

#### Ejemplo con transformación visual

```kotlin
SimpleLabel(
    text = "12031990",
    visualTransformation = MaskVisualTransformation(mask = "##/##/####")
)
```

### Configuración y personalización
- `text`: Texto a mostrar.
- `color`: Color del texto.
- `textAlign`: Alineación del texto.
- `isBoldText`: Negrita opcional.
- `style`: Estilo base de texto.
- `visualTransformation`: Transformación visual del texto.

### Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

### Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

---

## Licencia

Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.
