package com.example.kotlinmvvm.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinmvvm.interfacekotlin.LoginResultCallBacks

@Suppress("UNCHECKED_CAST")
class LoginViewModelFactory (private val listener: LoginResultCallBacks):ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LoginViewModel(listener) as T
    }
}