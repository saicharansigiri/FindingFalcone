package com.sigiri.findingfalcone.ui.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.sigiri.findingfalcone.core.BaseFragment
import com.sigiri.findingfalcone.databinding.FragmentSearchPlacesBinding
import com.sigiri.findingfalcone.viewmodel.SearchPlacesViewModel

class SearchPlacesFragment : BaseFragment<SearchPlacesViewModel, FragmentSearchPlacesBinding>() {

    override fun setUpViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSearchPlacesBinding {
        return FragmentSearchPlacesBinding.inflate(inflater, container, false)
    }

    override fun setUpViewModel(): SearchPlacesViewModel {
        return ViewModelProvider(this).get(SearchPlacesViewModel::class.java)
    }

}