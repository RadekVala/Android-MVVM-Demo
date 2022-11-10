package cz.utb.fai.mvvmdemo.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class SecretViewModelFactory(private val username: String) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SecretViewModel::class.java)) {
            return SecretViewModel(username) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}