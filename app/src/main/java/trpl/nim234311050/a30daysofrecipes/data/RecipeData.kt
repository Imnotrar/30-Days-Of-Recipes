package trpl.nim234311050.a30daysofrecipes.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class RecipeData(
    @StringRes val dateRes: Int,
    @StringRes val titleRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)
