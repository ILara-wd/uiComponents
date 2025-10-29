# Componente de Etiqueta para Android

Este módulo contiene componentes de UI para mostrar texto en aplicaciones Android usando Jetpack Compose. Incluye `LinkText` para texto con enlaces interactivos.

---

## LinkText

### Descripción breve
Componente que permite mostrar texto con enlaces interactivos dentro de un bloque de texto. Ideal para términos, políticas o cualquier texto con partes clicables.

### Características principales
- Soporte para múltiples enlaces en un solo bloque de texto.
- Personalización de color y estilo de los enlaces.
- Permite definir acciones personalizadas al hacer clic en cada enlace.
- Integración sencilla con Jetpack Compose.

### Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

### Guía de uso

```kotlin
import com.invex.one.uikit.components.label.LinkText
import com.invex.one.uikit.model.LinkTextData

LinkText(
    linkTextData = listOf(
        LinkTextData(text = "Consulta nuestra "),
        LinkTextData(
            text = "Política de Privacidad",
            tag = "privacy",
            annotation = "https://ejemplo.com/politica",
            onClick = { /* Acción personalizada */ }
        ),
        LinkTextData(text = ".")
    )
)
```

### Configuración y personalización
- `linkTextData`: Lista de segmentos de texto y enlaces.
- `modifier`: Modificador Compose para tamaño, padding, etc.
- `textAlign`: Alineación del texto.
- `colorLink`: Color de los enlaces.
- `linkStyle`: Estilo de los enlaces (color, fuente, peso, etc.).

### Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

### Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

---

## Licencia

Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.
