package trpl.nim234311050.a30daysofrecipes.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Define Light and Dark Color Schemes
private val LightColors = lightColorScheme(
    primary = Color(0xFF8BC34A),
    secondary = Color(0xFF03DAC6),
    background = Color(0xFFF5F5F5),
    surface = Color(0xFFFFFFFF),
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black
)

private val DarkColors = darkColorScheme(
    primary = Color(0xFFBB86FC),
    secondary = Color(0xFF03DAC6),  // Warna sekunder untuk tema gelap
    background = Color(0xFF121212),  // Latar belakang gelap
    surface = Color(0xFF121212),  // Permukaan gelap
    onPrimary = Color.Black,  // Warna teks di atas primary untuk tema gelap
    onSecondary = Color.Black,  // Warna teks di atas secondary untuk tema gelap
    onBackground = Color.White,  // Warna teks di atas background gelap
    onSurface = Color.White  // Warna teks di atas surface gelap
)

// Theme Composable Function
@Composable
fun _30DaysOfRecipesTheme(
    darkTheme: Boolean = false, // Pilih tema gelap atau terang
    content: @Composable () -> Unit
) {
    // Use light or dark color scheme based on the darkTheme flag
    val colors = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colors,  // Apply the color scheme
        content = content
    )
}
