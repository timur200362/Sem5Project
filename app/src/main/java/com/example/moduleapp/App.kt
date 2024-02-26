package com.example.moduleapp

import android.app.Application
import androidx.multidex.MultiDexApplication
import com.example.feature.home.impl.di.homeModule
import com.example.feature.homedetail.detailModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App:MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidLogger(Level.DEBUG)
            androidContext(this@App)
            modules(listOf(homeModule,detailModule))
        }
    }
}