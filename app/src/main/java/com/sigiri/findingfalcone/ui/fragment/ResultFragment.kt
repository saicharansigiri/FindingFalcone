package com.sigiri.findingfalcone.ui.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.sigiri.findingfalcone.core.BaseFragment
import com.sigiri.findingfalcone.databinding.FragmentResultBinding
import com.sigiri.findingfalcone.viewmodel.ResultViewModel

class ResultFragment : BaseFragment<ResultViewModel, FragmentResultBinding>() {
    override fun setUpViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentResultBinding {
        return FragmentResultBinding.inflate(inflater, container, false)
    }

    override fun setUpViewModel(): ResultViewModel {
        return ViewModelProvider(this)[ResultViewModel::class.java]
    }

}