package com.polish.blogtoday

import android.app.Application
import com.polish.blogtoday.di.AppComponent
import com.polish.blogtoday.di.DaggerAppComponent

open class MyApplication: Application() {

    val appComponent:AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }
}