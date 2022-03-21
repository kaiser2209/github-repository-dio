package me.dio.githubrepository.data.repositories

import kotlinx.coroutines.flow.Flow
import me.dio.githubrepository.data.model.Repo

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}