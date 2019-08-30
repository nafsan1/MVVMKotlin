package com.example.kotlinmvvm.ViewModel

import android.text.Editable
import android.text.TextWatcher
import androidx.lifecycle.ViewModel
import com.example.kotlinmvvm.Interface.LoginResultCallBacks
import java.util.*

class LoginViewModel (private val listener:LoginResultCallBacks):ViewModel(){
    val emailTextWatcher:TextWatcher
    get() = object:TextWatcher{
        override fun afterTextChanged(p0: Editable?) {
            
        }

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }
    }
}