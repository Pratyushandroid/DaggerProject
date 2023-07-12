package com.example.dagger_2project

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton


interface SaveUser {
        fun saveUser(email:String,password:String)

    }

@ActivityScope
    class saveUserInDB @Inject constructor(val analyticsService: AnalyticsService)  :SaveUser {
        override fun saveUser(email: String, password: String) {
            Log.d("PP", "saveUser: User Saved  in DB")
            analyticsService.trackEvent("Save User","CREATE")

        }
    }

class SaveUserInFirebase(val analyticsService: AnalyticsService):SaveUser {
    override fun saveUser(email: String, password: String) {
        Log.d("PP", "saveUser: User Save in Firebase ")
        analyticsService.trackEvent("Save User","CREATE")
    }
}
