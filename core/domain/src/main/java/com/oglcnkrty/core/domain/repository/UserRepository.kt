package com.oglcnkrty.core.domain.repository

import com.oglcnkrty.core.domain.model.User

interface UserRepository {

    suspend fun getUser(id: String): User
}