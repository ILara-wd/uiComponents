# ContactRowCard

Descripción: Componente para mostrar información de contacto en formato de tarjeta, con íconos interactivos y soporte para múltiples líneas de descripción.

## Ejemplo de uso
```kotlin
ContactRowCard(
    content = ContactRowContent(
        title = "WhatsApp Institucional",
        description1 = "55 4000 6566",
        icon1ResourceId = R.drawable.ic_whatsapp,
        icon1Action = { /* Acción para abrir WhatsApp */ }
    )
)
```

## Dependencias
- Jetpack Compose
- androidx.compose.material3
- com.invex.one.uikit.theme
- com.invex.one.uikit.commons.Constants

## Instalación
1. Agrega el módulo `uikit` a tu proyecto.
2. Importa el componente en tu archivo Kotlin:
   ```kotlin
   import com.invex.one.uikit.components.ContactRowCard
   import com.invex.one.uikit.components.ContactRowContent
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

