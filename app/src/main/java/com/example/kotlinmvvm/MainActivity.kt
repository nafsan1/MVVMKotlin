package com.example.kotlinmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.kotlinmvvm.databinding.ActivityMainBinding
import com.example.kotlinmvvm.interfacekotlin.LoginResultCallBacks
import com.example.kotlinmvvm.viewModel.LoginViewModel
import com.example.kotlinmvvm.viewModel.LoginViewModelFactory

import es.dmoral.toasty.Toasty

class MainActivity : AppCompatActivity(),LoginResultCallBacks {
    override fun onSucces(message: String) {
        Toasty.success(this,message, Toast.LENGTH_SHORT).show()
    }

    override fun onError(message: String) {
        Toasty.success(this,message, Toast.LENGTH_SHORT).show()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainBinding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        activityMainBinding.viewModelKotlin = ViewModelProviders.of(this, LoginViewModelFactory(this))
            .get(LoginViewModel::class.java)
    }
}
