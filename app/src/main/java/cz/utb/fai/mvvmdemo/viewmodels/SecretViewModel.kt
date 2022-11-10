package cz.utb.fai.mvvmdemo.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import cz.utb.fai.mvvmdemo.models.User

class SecretViewModel(username: String) : ViewModel() {
     var name = username

    init {
        Log.i("SecretViewModel", "Username is $name")
    }
}