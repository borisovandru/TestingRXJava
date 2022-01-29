package com.borisov.testingrxjava.view.details

import com.borisov.testingrxjava.view.ViewContract

internal interface ViewDetailsContract : ViewContract {
    fun setCount(count: Int)
}