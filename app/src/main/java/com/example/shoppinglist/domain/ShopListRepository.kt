package com.example.shoppinglist.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)
    fun deleteShopItem(shopItem: ShopItem)
    fun editShopItemUseCase(shopItem: ShopItem)
    fun getShopItem(shopItem: Int): ShopItem
    fun getShopList(): LiveData<List<ShopItem>>
}