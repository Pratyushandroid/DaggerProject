 package com.example.dagger_2project

import android.annotation.SuppressLint
import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

 class MainActivity : AppCompatActivity() {
     @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // two topic is left i.e is Subcomponent and Builder

//        val userRepository = UserRepository()
//        val emailService = EmailService()
//
//        val userRegistrationService  = UserRegistrationService(emailService,userRepository)

        // for constructor
/*
       val userRegistrationService = DaggerUserComponent.builder().build().getUserRegistrationService()
        val emailService = DaggerUserComponent.builder().build().emailService()

        userRegistrationService.registeredUser("Pratyush@gmail.com","Pratyush%24e25")
        emailService.sendEmail("anuj@gmail.com","pratyush@gmail.com","Both are same")

 */
//      val component  = DaggerUserComponent.builder()
          //.notificationServiceModule(NotificationServiceModule(3))
           // .build()
                val appComponent = (application as UserApplication).appComponent
             val userRegistrationComponent = DaggerUserComponent.factory().create(3,appComponent)

        userRegistrationComponent.inject(this)
       // userRegistrationComponent.inject(this@MainActivity)

        userRegistrationService.registeredUser("Anuj@gmail.com","PPPP123")
    }
}