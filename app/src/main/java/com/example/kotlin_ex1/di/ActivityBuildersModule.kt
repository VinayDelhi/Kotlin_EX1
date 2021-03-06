package com.example.kotlin_ex1.di


import com.example.kotlin_ex1.di.main.MainModule
import com.example.kotlin_ex1.di.main.MainScope
import com.example.kotlin_ex1.di.main.MainViewModelsModule
import com.example.kotlin_ex1.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @MainScope
    @ContributesAndroidInjector(
        modules = [
            MainModule::class,
            MainViewModelsModule::class
        ]
    )
    abstract fun contributeMainActivity(): MainActivity
}