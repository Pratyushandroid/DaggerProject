package com.example.dagger_2project

import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {

    fun getAnalyticsService (): AnalyticsService
}