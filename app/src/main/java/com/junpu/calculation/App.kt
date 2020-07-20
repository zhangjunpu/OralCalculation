package com.junpu.calculation

import android.app.Application
import com.junpu.log.L
import com.junpu.toast.toastContext

/**
 *
 * @author junpu
 * @date 2020/7/17
 */
class App : Application() {

    companion object {
        lateinit var app: App
    }

    override fun onCreate() {
        super.onCreate()
        app = this
        L.logEnable = BuildConfig.DEBUG
        toastContext = this
    }
}