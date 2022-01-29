package com.borisov.testingrxjava.view.search

import com.borisov.testingrxjava.model.SearchResult
import com.borisov.testingrxjava.view.ViewContract

internal interface ViewSearchContract : ViewContract {
    fun displaySearchResults(
        searchResults: List<SearchResult>,
        totalCount: Int
    )

    fun displayError()
    fun displayError(error: String)
    fun displayLoading(show: Boolean)
}