package com.example.flash.data


import androidx.annotation.StringRes

import com.example.flash.R



object DataSource {
    fun loadCategories(): List<Categories> {
        return listOf<Categories>(
            Categories(stringResourceId = R.string.fresh_fruits, imageResourceId =R.drawable.fruits ),
            Categories(R.string.beverages, R.drawable.baverages),
            Categories( R.string.bread_biscuits, R.drawable.bread),
            Categories(R.string.kitchen_essentials, R.drawable.kitchenessentials),
            Categories(R.string.munchies, R.drawable.munchies),
            Categories(R.string.packaged_food, R.drawable.packaged_food),
            Categories( R.string.stationary, R.drawable.stationary),
            Categories(R.string.pet_food, R.drawable.petfood),
            Categories(R.string.sweet_tooth, R.drawable.sweets),
            Categories(R.string.vegetables, R.drawable.veggies),
            Categories(R.string.bath_body, R.drawable.bathbody),

        )
    }
    fun loadItems(
        @StringRes categoryName:Int
    ): List<Item> {
        return listOf(
            Item(R.string.banana_robusta,R.string.fresh_fruits,"1kg",30,R.drawable.bananas),
            Item(R.string.shimla_apple,R.string.fresh_fruits,"1kg",100,R.drawable.applew),
            Item(R.string.papaya_semi_ripe,R.string.fresh_fruits,"1kg",150,R.drawable.oranges),
            Item(R.string.pineapple,R.string.fresh_fruits,"1kg",130,R.drawable.pineapple),
            Item(R.string.pomegranate,R.string.fresh_fruits,"500gm",120,R.drawable.strawberries),
            Item(R.string.pepsi_can,R.string.beverages,"1",20,R.drawable.pepsi)
        ).filter{
            it.itemCategoryId == categoryName
        }


    }
}