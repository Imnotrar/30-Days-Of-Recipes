package trpl.nim234311050.a30daysofrecipes.model

import trpl.nim234311050.a30daysofrecipes.R
import trpl.nim234311050.a30daysofrecipes.data.RecipeData

object Recipe {
    val recipes = listOf(
        RecipeData(
            dateRes = R.string.date1,
            titleRes = R.string.title1,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.bakso
        ),
        RecipeData(
            dateRes = R.string.date2,
            titleRes = R.string.title2,
            descriptionRes = R.string.description2,
            imageRes = R.drawable.rendang
        ),
        RecipeData(
            dateRes = R.string.date3,
            titleRes = R.string.title3,
            descriptionRes = R.string.description3,
            imageRes = R.drawable.soto
        ),
        RecipeData(
            dateRes = R.string.date4,
            titleRes = R.string.title4,
            descriptionRes = R.string.description4,
            imageRes = R.drawable.ayam_geprek
        ),
        RecipeData(
            dateRes = R.string.date5,
            titleRes = R.string.title5,
            descriptionRes = R.string.description5,
            imageRes = R.drawable.gado2
        ),
        RecipeData(
            dateRes = R.string.date6,
            titleRes = R.string.title6,
            descriptionRes = R.string.description6,
            imageRes = R.drawable.nasi_oncom
        ),
        RecipeData(
            dateRes = R.string.date7,
            titleRes = R.string.title7,
            descriptionRes = R.string.description7,
            imageRes = R.drawable.sate
        ),
        RecipeData(
            dateRes = R.string.date8,
            titleRes = R.string.title8,
            descriptionRes = R.string.description8,
            imageRes = R.drawable.nasi_padang
        )
    )
}
