package cz.utb.fai.mvvmdemo.viewmodels

import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController


import cz.utb.fai.mvvmdemo.R
import cz.utb.fai.mvvmdemo.models.User
import cz.utb.fai.mvvmdemo.views.LoginFragmentDirections

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

    fun btnLoginClicked (view: View) {
        Log.i("MYAPP", "Button Login was clicked")
        if(user.email == "admin@example.com" && user.password == "123456789") {
            val action = LoginFragmentDirections.actionFirstFragmentToSecretFragment(username = user.email)
            view.findNavController().navigate(action)
        }
    }
}