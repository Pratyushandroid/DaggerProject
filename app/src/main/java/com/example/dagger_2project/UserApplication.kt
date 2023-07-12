package com.example.dagger_2project

import android.app.Application

class UserApplication : Application() {

    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
    appComponent = DaggerAppComponent.builder().build()

    }
}