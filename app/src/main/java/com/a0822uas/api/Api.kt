package com.a0822uas.api

import com.a0822uas.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token d1d924b9e1c90acc7ac139dd2d757018f8cecc8d")
    fun getSearchUsers(
            @Query("q") query: String
    ): Call<UserResponse>
}