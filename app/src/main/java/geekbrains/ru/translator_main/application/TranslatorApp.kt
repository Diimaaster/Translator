package geekbrains.ru.translator_main.application

import android.app.Application
import geekbrains.ru.translator_main.di.application
import geekbrains.ru.translator_main.di.historyScreen
import geekbrains.ru.translator_main.di.mainScreen
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class TranslatorApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(applicationContext)
            modules(listOf(application, mainScreen, historyScreen))
        }
    }
}
