package com.oglcnkrty.core.data.datasource

import com.oglcnkrty.core.domain.model.User

interface UserRemoteDataSource {
    suspend fun getUser(id: String): User
}