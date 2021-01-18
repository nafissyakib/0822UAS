package com.a0822uas.api

import com.a0822uas.data.model.DetailUserResponse
import com.a0822uas.data.model.User
import com.a0822uas.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token d1d924b9e1c90acc7ac139dd2d757018f8cecc8d")
    fun getSearchUsers(
            @Query("q") query: String
    ): Call<UserResponse>
    @GET("users/{username}")
    @Headers("Authorization: token d1d924b9e1c90acc7ac139dd2d757018f8cecc8d")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token d1d924b9e1c90acc7ac139dd2d757018f8cecc8d")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token d1d924b9e1c90acc7ac139dd2d757018f8cecc8d")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}