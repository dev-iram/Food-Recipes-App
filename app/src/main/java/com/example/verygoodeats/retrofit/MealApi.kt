package com.example.verygoodeats.retrofit

import com.example.verygoodeats.pojo.MealList
import retrofit2.Call
import retrofit2.http.GET

interface MealApi {

    @GET("random.php")
    fun getRandomMeal():Call<MealList>
}