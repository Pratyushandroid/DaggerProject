package com.example.dagger_2project

import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
   @MessageQualifier private val  notificationService: NotificationService,
     private val userRepository:SaveUser
     ){
    fun registeredUser(email:String,password:String){
        userRepository.saveUser(email, password)
        notificationService.send(email,"pratyush@gmail.com","How are you Baby")
    }
}