package cz.utb.fai.mvvmdemo.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import cz.utb.fai.mvvmdemo.models.User

class LoginViewModel : ViewModel() {

    lateinit var user: User

    init {
        Log.i("MYAPP", "LoginViewModel was created")
        user = User("","")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("MYAPP", "LoginViewModel was destroyed!")
    }
}