package com.busra.lenovo.retrofitsample.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object {
        fun getClient(): Retrofit {

            return Retrofit.Builder()

                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://api.sonraneoldu.com/v2/")
                .build()


        }
    }
}