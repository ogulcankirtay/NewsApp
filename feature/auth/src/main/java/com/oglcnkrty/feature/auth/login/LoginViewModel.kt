package com.oglcnkrty.feature.auth.login

import androidx.lifecycle.ViewModel
import com.oglcnkrty.core.domain.repository.UserRepository

class LoginViewModel(
    private val userRepository: UserRepository
): ViewModel() {
    fun getUser(id: String){
        viewModelScope.launch{
            userRepository.getUser(id)
        }
    }


}