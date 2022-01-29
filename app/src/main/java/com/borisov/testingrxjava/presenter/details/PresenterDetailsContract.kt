package com.borisov.testingrxjava.presenter.details

import com.borisov.testingrxjava.presenter.PresenterContract

internal interface PresenterDetailsContract : PresenterContract {
    fun setCounter(count: Int)
    fun onIncrement()
    fun onDecrement()
}