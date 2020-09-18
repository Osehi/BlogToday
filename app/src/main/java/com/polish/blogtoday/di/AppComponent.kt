package com.polish.blogtoday.di

import android.content.Context
import com.polish.blogtoday.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface AppComponent {

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance context: Context):AppComponent

    }

    fun inject(activity:MainActivity)

}