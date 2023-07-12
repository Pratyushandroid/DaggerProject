package com.example.dagger_2project

import dagger.BindsInstance
import dagger.Component
import javax.inject.Inject
import javax.inject.Singleton


@Component(dependencies = [AppComponent::class], modules = [UserRepositoryModule::class,NotificationServiceModule::class])
@ActivityScope
interface UserComponent {

    // for constructor Injection
//    fun getUserRegistrationService():UserRegistrationService
//    fun emailService():EmailService
//
//    // field Injection

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface  Factory{
        fun create(@BindsInstance retryCount : Int,appComponent: AppComponent):UserComponent

        }

}


