package com.example.mycity.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class PlaceInfo(
    @StringRes val name: Int,
    @StringRes val details: Int,
    @DrawableRes val image: Int
        )

data class CategoryInfo (
    @StringRes val title: Int,
    val places: List<PlaceInfo>
)