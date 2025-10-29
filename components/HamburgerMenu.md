# HamburgerMenu - Menú Lateral (Hamburguesa) para Android

## Descripción breve
`HamburgerMenu` es un componente Jetpack Compose que implementa un menú lateral (drawer) personalizable, ideal para la navegación principal en aplicaciones Android. Permite mostrar información de usuario, lista de opciones (simples y expandibles), acciones como cerrar sesión y pie de menú con información adicional.

## Características principales
- Menú lateral con soporte para drawer y cierre.
- Muestra información de usuario (nombre, última sesión, versión).
- Lista de opciones de menú: ítems simples y expandibles.
- Botón de cierre de sesión (logout).
- Pie de menú con logotipo y datos adicionales.
- Personalización de colores, íconos y acciones.
- Compatible con temas y tipografías del proyecto.

## Requisitos de instalación
- Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1 o superior
- Kotlin 1.8+
- Jetpack Compose 1.5+
- Gradle 8.0+

## Guía de uso

### Implementación básica
```kotlin
import com.invex.one.uikit.components.bar.hamburgerMenu.HamburgerMenu
import com.invex.one.uikit.components.bar.hamburgerMenu.HamburgerMenuUserInfo
import com.invex.one.uikit.components.bar.hamburgerMenu.HamburgerMenuActions
import com.invex.one.uikit.components.bar.hamburgerMenu.BaseMenuItem
import androidx.compose.material3.DrawerState
import androidx.compose.foundation.layout.PaddingValues

val userInfo = HamburgerMenuUserInfo(
    userName = "Juan Pérez",
    lastLogin = "24/09/2025 10:30",
    version = "v1.2.3"
)
val menuItems = listOf<BaseMenuItem>(/* ... */)
val drawerState: DrawerState = /* ... */
val paddingValues = PaddingValues(0.dp)

HamburgerMenu(
    userInfo = userInfo,
    drawerState = drawerState,
    paddingValues = paddingValues,
    menuItems = menuItems,
    actions = HamburgerMenuActions(
        onCloseDrawer = { /* Acción para cerrar drawer */ },
        onLogoutClick = { /* Acción de logout */ },
        content = { /* Contenido principal de la pantalla */ }
    ),
    onProfileClick = { /* Acción al hacer clic en perfil */ }
)
```

### Ejemplo de ítems de menú
```kotlin
val menuItems = listOf(
    BaseMenuItem.SimpleItem(MenuItem(R.string.menu_my_account, icon) { /* ... */ }),
    BaseMenuItem.ExpandableItem(
        ExpandableMenuItem(R.string.menu_help_center, icon, listOf(/* subItems */))
    )
)
```

## Configuración y personalización
- `userInfo`: Información del usuario (nombre, última sesión, versión).
- `drawerState`: Estado del drawer para apertura/cierre.
- `paddingValues`: Espaciado interno del menú.
- `menuItems`: Lista de ítems de menú (simples y expandibles).
- `actions`: Acciones disponibles (cerrar, logout, contenido principal).
- `onProfileClick`: Acción al hacer clic en el perfil.
- Personalización de colores, íconos y estilos mediante temas.

## Capturas de pantalla
_Agrega aquí imágenes del componente en uso si aplica._

## Dependencias
- `androidx.compose.material3:material3`
- `androidx.compose.ui:ui`
- Dependencias internas del proyecto `uikit`

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

