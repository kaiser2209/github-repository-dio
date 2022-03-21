package me.dio.githubrepository.domain

import kotlinx.coroutines.flow.Flow
import me.dio.githubrepository.core.UseCase
import me.dio.githubrepository.data.model.Repo
import me.dio.githubrepository.data.repositories.RepoRepository

class ListUserRepositoriesUseCase(private val repository: RepoRepository) : UseCase<String, List<Repo>>() {
    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}