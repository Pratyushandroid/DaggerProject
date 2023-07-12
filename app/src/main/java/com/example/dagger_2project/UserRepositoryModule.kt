package com.example.dagger_2project

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class UserRepositoryModule {

    @Binds
    @ActivityScope
  abstract fun getSQLDataRepository(datasaveUserInDB: saveUserInDB):SaveUser


}