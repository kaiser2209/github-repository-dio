package me.dio.githubrepository

import android.app.Application
import me.dio.githubrepository.data.di.DataModule
import me.dio.githubrepository.domain.di.DomainModule
import me.dio.githubrepository.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}