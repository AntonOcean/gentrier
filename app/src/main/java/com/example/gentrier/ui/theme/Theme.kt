package com.example.gentrier.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

// Alpine-inspired color palette
val GlacierBlue = Color(0xFF2A93D5)
val DarkGlacierBlue = Color(0xFF1A6394)
val SkiRed = Color(0xFFE53935)
val DarkSkiRed = Color(0xFFB71C1C)
val SnowWhite = Color(0xFFF5F5F5)
val MountainGray = Color(0xFF424242)
val PineGreen = Color(0xFF388E3C)
val DarkPineGreen = Color(0xFF1B5E20)

private val DarkColorScheme = darkColorScheme(
    primary = GlacierBlue,
    onPrimary = SnowWhite,
    primaryContainer = DarkGlacierBlue,
    onPrimaryContainer = SnowWhite,
    secondary = SkiRed,
    onSecondary = SnowWhite,
    secondaryContainer = DarkSkiRed,
    onSecondaryContainer = SnowWhite,
    tertiary = PineGreen,
    onTertiary = SnowWhite,
    tertiaryContainer = DarkPineGreen,
    onTertiaryContainer = SnowWhite,
    background = Color(0xFF121212),
    onBackground = SnowWhite,
    surface = Color(0xFF121212),
    onSurface = SnowWhite
)

private val LightColorScheme = lightColorScheme(
    primary = GlacierBlue,
    onPrimary = SnowWhite,
    primaryContainer = Color(0xFFD1E4FF),
    onPrimaryContainer = DarkGlacierBlue,
    secondary = SkiRed,
    onSecondary = SnowWhite,
    secondaryContainer = Color(0xFFFFDAD5),
    onSecondaryContainer = DarkSkiRed,
    tertiary = PineGreen,
    onTertiary = SnowWhite,
    tertiaryContainer = Color(0xFFABDFBD),
    onTertiaryContainer = DarkPineGreen,
    background = SnowWhite,
    onBackground = MountainGray,
    surface = SnowWhite,
    onSurface = MountainGray
)

@Composable
fun GentrierTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
} 