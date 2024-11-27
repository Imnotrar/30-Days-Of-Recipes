package trpl.nim234311050.a30daysofrecipes.ui.theme

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import trpl.nim234311050.a30daysofrecipes.model.Recipe
import trpl.nim234311050.a30daysofrecipes.components.RecipeCard

@Composable
fun RecipeListScreen(contentPadding: PaddingValues) {
    LazyColumn(
        contentPadding = contentPadding
    ) {
        items(Recipe.recipes) { recipe ->
            RecipeCard(recipe = recipe)
        }
    }
}
