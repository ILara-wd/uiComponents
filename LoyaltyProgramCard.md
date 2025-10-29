# LoyaltyProgramCard

Descripción: Componente que muestra una tarjeta con información del programa de lealtad del usuario, incluyendo puntos disponibles y opción de navegación. Ideal para dashboards o secciones de beneficios en Android.

## Ejemplo de uso
```kotlin
LoyaltyProgramCard(
    points = "1500",
    onNavigate = { /* Acción de navegación */ }
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
   import com.invex.one.uikit.components.cards.LoyaltyProgramCard
   ```
3. Utiliza el componente en tu función @Composable.

## Autor
- Irving Lara
- 24 de septiembre del 2025

