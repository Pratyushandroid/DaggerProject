package com.example.dagger_2project

import dagger.Module
import dagger.Provides

@Module
class AnalyticsModule {

    @Provides
    fun getAnalyticsServices():AnalyticsService {
        return MixPanel()
    }
}