package com.sigiri.findingfalcone.core

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.sigiri.findingfalcone.R

abstract class BaseActivity<V : ViewBinding> : AppCompatActivity() {

    lateinit var binding: V

    abstract fun setUpViewBinding(): V

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = setUpViewBinding()
        setContentView(binding.root)
    }
}