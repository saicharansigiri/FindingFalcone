package com.sigiri.findingfalcone.ui.activity

import android.os.Bundle
import com.sigiri.findingfalcone.core.BaseActivity
import com.sigiri.findingfalcone.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun setUpViewBinding(): ActivityMainBinding =
        ActivityMainBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}