package com.borisov.testingrxjava.repository

import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
import com.borisov.testingrxjava.model.SearchResponse
import kotlinx.coroutines.Deferred

internal interface GitHubApi {

    @Headers("Accept: application/vnd.github.mercy-preview+json")
    @GET("search/repositories")
    fun searchGithub(@Query("q") term: String?): Call<SearchResponse?>?


    @Headers("Accept: application/vnd.github.mercy-preview+json")
    @GET("search/repositories")
    fun searchGithubRx(@Query("q") term: String?): Observable<SearchResponse>

    @Headers("Accept: application/vnd.github.mercy-preview+json")
    @GET("search/repositories")
    fun searchGithubAsync(@Query("q") term: String?): Deferred<SearchResponse>

}