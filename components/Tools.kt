package com.invex.one.uikit.components.developer.util

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.activity.result.ActivityResultLauncher
import androidx.compose.runtime.Composable
import com.google.gson.Gson
import com.invex.one.uikit.commons.ConstantsFile.CODE_DATA
import com.invex.one.uikit.commons.ConstantsFile.CODE_KEYWORDS
import com.invex.one.uikit.commons.ConstantsFile.README
import com.invex.one.uikit.components.developer.model.CodeData
import com.invex.one.uikit.components.developer.model.CodeKeywords
import com.invex.one.uikit.components.developer.model.CodeViewerColors
import com.invex.one.uikit.theme.codeViewerAnnotationLight
import com.invex.one.uikit.theme.codeViewerBackgroundLight
import com.invex.one.uikit.theme.codeViewerCommentLight
import com.invex.one.uikit.theme.codeViewerDefaultLight
import com.invex.one.uikit.theme.codeViewerKeywordLight
import com.invex.one.uikit.theme.codeViewerStringLight
import com.invex.one.uikit.theme.codeViewerTypeLight

object Tools {

    /**
     * Devuelve los colores predeterminados para el visor de código según el tema activo en el dispositivo.
     *
     * @return Un objeto `CodeViewerColors` con los colores configurados para el tema claro.
     */
    @Composable
    fun defaultCodeViewerColors(): CodeViewerColors {
        //val isDark = isSystemInDarkTheme()
        //return if (isDark) {
        /**CodeViewerColors(
        backgroundDark = codeViewerBackgroundDark,
        defaultDark = codeViewerDefaultDark,
        keywordDark = codeViewerKeywordDark,
        typeDark = codeViewerTypeDark,
        annotationDark = codeViewerAnnotationDark,
        stringDark = codeViewerStringDark,
        commentDark = codeViewerCommentDark,
        )*/
        //} else {
        return CodeViewerColors(
            background = codeViewerBackgroundLight,
            default = codeViewerDefaultLight,
            keyword = codeViewerKeywordLight,
            type = codeViewerTypeLight,
            annotation = codeViewerAnnotationLight,
            string = codeViewerStringLight,
            comment = codeViewerCommentLight,
        )
        //}

    }

    /**
     * Carga las palabras clave de código desde el archivo `code_keywords.json` ubicado en los assets.
     *
     * @return Un objeto `CodeKeywords` con las palabras clave cargadas.
     */
    fun Context.loadCodeKeywords(): CodeKeywords {
        val jsonString = assets.open(CODE_KEYWORDS)
            .bufferedReader().use { it.readText() }
        return Gson().fromJson(jsonString, CodeKeywords::class.java)
    }

    /**
     * Carga los datos de código desde el archivo `code_data.json` ubicado en los assets de la aplicación.
     *
     * @return Un objeto `CodeData` con la información de código cargada desde el archivo JSON.
     */
    fun Context.loadCodeData(): CodeData {
        val jsonString = assets.open(CODE_DATA)
            .bufferedReader().use { it.readText() }
        return Gson().fromJson(jsonString, CodeData::class.java)
    }

    /**
     * Carga el contenido de un archivo desde los assets de la aplicación.
     *
     * @param context Contexto utilizado para acceder a los assets.
     * @param fileName Nombre del archivo a cargar (por defecto "README.md").
     * @return Una cadena con el contenido del archivo especificado.
     */
    fun loadReadmeFromAssets(context: Context, fileName: String = README): String {
        val jsonString = context.assets.open(fileName)
            .bufferedReader().use { it.readText() }
        return jsonString
    }

    /**
     * Abre una URL en el navegador utilizando un `ActivityResultLauncher`.
     *
     * @param url La URL que se desea abrir.
     * @param launcher El `ActivityResultLauncher` que lanzará el intent para abrir la URL en el navegador.
     */
    fun openUrlInBrowser(url: String, launcher: ActivityResultLauncher<Intent>) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        launcher.launch(intent)
    }

}
