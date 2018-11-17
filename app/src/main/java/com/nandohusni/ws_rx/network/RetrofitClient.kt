package com.nandohusni.ws_rx.network

import io.reactivex.Observable
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit
import retrofit2.http.GET

 object RetrofitClient {


    var retrofit = Retrofit.Builder()
        .baseUrl("https://api.stackexchange.com/2.2/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var service = retrofit.create<ApiService>(ApiService::class.java!!)
}

interface ApiService {




}
