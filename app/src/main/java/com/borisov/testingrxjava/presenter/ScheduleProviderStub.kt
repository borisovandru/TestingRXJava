package com.borisov.testingrxjava.presenter

import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers
import com.borisov.testingrxjava.presenter.SchedulerProvider

class ScheduleProviderStub : SchedulerProvider {
    override fun ui(): Scheduler {
        return Schedulers.trampoline()
    }

    override fun io(): Scheduler {
        return Schedulers.trampoline()
    }
}