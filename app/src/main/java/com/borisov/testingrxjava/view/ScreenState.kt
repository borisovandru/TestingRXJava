package com.borisov.testingrxjava.view

import com.borisov.testingrxjava.model.SearchResponse

sealed class ScreenState {
    object Loading : ScreenState()
    data class Working(val searchResponse: SearchResponse) : ScreenState()
    data class Error(val error: Throwable) : ScreenState()
}