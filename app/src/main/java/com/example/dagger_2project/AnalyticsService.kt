package com.example.dagger_2project

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Singleton


interface AnalyticsService {
    fun trackEvent(eventName : String,eventType:String)
}

class MixPanel : AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, "Mixpanel - $eventName - $eventType ")
    }
}

class Firebase :AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, "Firebase: -  $eventName - $eventType")
    }
}