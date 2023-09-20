package com.sigiri.findingfalcone.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<M : ViewModel, V : ViewBinding> : Fragment() {

    lateinit var binding: V
    lateinit var viewModel: M

    abstract fun setUpViewBinding(inflater: LayoutInflater, container: ViewGroup?): V
    abstract fun setUpViewModel(): M

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = setUpViewBinding(inflater, container)
        viewModel = setUpViewModel()
        return binding.root
    }

}