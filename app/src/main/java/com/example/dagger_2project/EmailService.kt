package com.example.dagger_2project

import android.util.Log
import javax.inject.Inject



interface NotificationService{
        fun send(to:String,from:String,body:String)
    }

@ActivityScope
    class EmailService @Inject constructor():NotificationService{
        override fun send(to: String, from: String, body: String) {
            Log.d("PP", "send: Email Send ")
        }

    }

    class MessageSend  @Inject constructor(private val retryCount:Int):NotificationService{
        override fun send(to: String, from: String, body: String) {
            Log.d("PP", "send: Message Send - retry Count $retryCount")
        }

    }
