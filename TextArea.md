# TextArea

Descripción: Campo de texto multilínea para ingresar comentarios, descripciones o textos largos en Android. Permite ajustar el número de líneas, mostrar el conteo de caracteres y mensajes de error si se supera el límite.

## Ejemplo de uso
```kotlin
TextArea(
    value = "Comentario...",
    onValueChange = { /* Actualiza el texto */ },
    isTouched = true,
    maxChars = 150,
    placeholderText = "Escribe tu comentario",
    onTouched = { /* Marca como tocado */ }
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.theme

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.textField.TextArea
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

