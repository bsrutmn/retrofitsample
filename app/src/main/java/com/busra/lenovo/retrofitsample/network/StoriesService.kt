package com.busra.lenovo.retrofitsample.network

import com.busra.lenovo.retrofitsample.network.response.StoriesByIdResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface StoriesService {


    @GET("stories/{id}")
    fun getStoriesById(@Path("id") id:String): Call<StoriesByIdResponse>

}