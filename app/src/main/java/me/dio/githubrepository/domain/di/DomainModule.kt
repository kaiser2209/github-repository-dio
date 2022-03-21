package me.dio.githubrepository.domain.di

import me.dio.githubrepository.data.di.DataModule
import me.dio.githubrepository.domain.ListUserRepositoriesUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {
    fun load() {
        loadKoinModules(useCaseModule())
    }

    private fun useCaseModule() : Module {
        return module {
            factory { ListUserRepositoriesUseCase(get()) }
        }
    }
}