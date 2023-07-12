package com.example.dagger_2project

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule() {

    @ActivityScope
   @MessageQualifier
    @Provides
    fun getMessageRepository(retryCount : Int):NotificationService{
        return MessageSend(retryCount)
    }

    @Named("Email")
    @Provides
    fun getEmailRepository(emailService: EmailService):NotificationService{
        return emailService
    }
}