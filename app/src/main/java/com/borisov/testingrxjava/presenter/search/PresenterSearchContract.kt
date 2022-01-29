package com.borisov.testingrxjava.presenter.search

import com.borisov.testingrxjava.presenter.PresenterContract

internal interface PresenterSearchContract : PresenterContract {
    fun searchGitHub(searchQuery: String)
}