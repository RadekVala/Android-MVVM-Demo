package cz.utb.fai.mvvmdemo.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    init {
        Log.i("MYAPP", "LoginViewModel was created")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("MYAPP", "LoginViewModel was destroyed!")
    }
}