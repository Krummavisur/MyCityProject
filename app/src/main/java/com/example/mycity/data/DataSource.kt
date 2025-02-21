package com.example.mycity.data

import com.example.mycity.R
import com.example.mycity.model.CategoryInfo
import com.example.mycity.model.PlaceInfo

object DataSource {
    fun getCategoryData(): List<CategoryInfo> {
        return listOf(
            CategoryInfo(
                title = R.string.coffee_category,
                places = listOf( PlaceInfo(
                    name = R.string.blackberry,
                    details = R.string.blackberry_details,
                    image = R.drawable.bb
                    ),
                    PlaceInfo(
                        name = R.string.tvoya_chashka,
                        details = R.string.chaska_details,
                        image = R.drawable.i
                    ),
                    PlaceInfo(
                        name = R.string.coffee_people,
                        details = R.string.coffee_people_details,
                        image = R.drawable.cf
                    ),
                    PlaceInfo(
                        name = R.string.garage,
                        details = R.string.garage_description,
                        image = R.drawable.s
                    )
                )
            )
        )
    }
}