package com.oglcnkrty.core.data.repository

import com.oglcnkrty.core.data.datasource.UserRemoteDataSource
import com.oglcnkrty.core.domain.model.User
import com.oglcnkrty.core.domain.repository.UserRepository

class UserRepositoryImpl(
    private val userRemoteDataSource: UserRemoteDataSource
) : UserRepository {

    override suspend fun getUser(id: String): User {
        return userRemoteDataSource.getUser(id)
    }
}