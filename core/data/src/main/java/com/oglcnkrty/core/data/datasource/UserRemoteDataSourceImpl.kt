package com.oglcnkrty.core.data.datasource

import com.oglcnkrty.core.domain.model.User
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import kotlinx.serialization.json.Json

class UserRemoteDataSourceImpl(
    private val restApi: HttpClient,
    private val json: Json
) : UserRemoteDataSource {

    override suspend fun getUser(id: String): User {
        val response = restApi.get("www.example.com/user/$id")
        val rawJson = response.bodyAsText()
        val result: User = json.decodeFromString(rawJson)

        return result
    }

}