package com.borisov.testingrxjava.presenter

import io.reactivex.Observable
import com.borisov.testingrxjava.model.SearchResponse
import com.borisov.testingrxjava.repository.RepositoryCallback

interface RepositoryContract {

    fun searchGithub(
        query: String,
        callback: RepositoryCallback
    )

    fun searchGithub(
        query: String
    ): Observable<SearchResponse>
}