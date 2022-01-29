package com.borisov.testingrxjava.repository

import retrofit2.Response
import com.borisov.testingrxjava.model.SearchResponse

interface RepositoryCallback {
    fun handleGitHubResponse(response: Response<SearchResponse?>?)
    fun handleGitHubError()
}