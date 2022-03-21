package me.dio.githubrepository.data.services

import me.dio.githubrepository.data.model.Repo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String): List<Repo>
}