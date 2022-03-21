package me.dio.githubrepository.data.repositories

import kotlinx.coroutines.flow.flow
import me.dio.githubrepository.core.RemoteException
import me.dio.githubrepository.data.services.GitHubService
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {

    override suspend fun listRepositories(user: String) = flow {
        try {
            val repoList = service.listRepositories(user)
            emit(repoList)
        } catch (e: HttpException) {
            throw RemoteException(e.message ?: "Não foi possível fazer a busca no momento!")
        }
    }

}