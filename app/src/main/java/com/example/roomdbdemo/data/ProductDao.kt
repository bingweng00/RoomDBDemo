package com.example.roomdbdemo.data

import androidx.room.*

@Dao
interface ProductDao {

    @Insert
    fun insertProduct(p : Product)

    @Delete()
    fun delete(p:Product)


    @Query("Select * From product_table")
    fun getAll() : List<Product>

    @Query("Select * From product_table Where price < :priceRange")
    fun getPriceLessThan(priceRange:Double): List<Product>
}