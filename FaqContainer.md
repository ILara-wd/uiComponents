
## Requisitos de instalación
- Kotlin 1.8+
- AndroidX 1.2.0+

## Guía de uso
```kotlin
val faqContainer = FaqContainer(context)
faqContainer.setFaqList(listOf(Faq("¿Cómo pago?", "Puedes pagar con tarjeta o transferencia.")))
```

## Configuración y personalización
- Modifica el color de fondo y el estilo de las preguntas:
```kotlin
faqContainer.setBackgroundColor(Color.WHITE)
faqContainer.setQuestionTextStyle(Typeface.BOLD)
```

## Dependencias
- implementation("androidx.core:core-ktx:1.12.0")

## Licencia
MIT

## Autor
Irving Lara
24 de septiembre del 2025
# FaqContainer

Componente para mostrar preguntas frecuentes (FAQ) en formato expandible, mejorando la experiencia de usuario en la consulta de información.

## Características principales
- Lista de preguntas y respuestas expandibles.
- Animaciones de expansión y colapso.
- Personalización de estilos y colores.
- Integración sencilla en cualquier pantalla.

