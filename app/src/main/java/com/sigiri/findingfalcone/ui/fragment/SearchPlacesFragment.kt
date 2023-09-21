package com.sigiri.findingfalcone.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.sigiri.findingfalcone.core.AppAction
import com.sigiri.findingfalcone.core.BaseFragment
import com.sigiri.findingfalcone.core.WidgetCallBack
import com.sigiri.findingfalcone.data.api.ApiUtils
import com.sigiri.findingfalcone.data.api.FalconsApiInterface
import com.sigiri.findingfalcone.data.repository.FalconeRepository
import com.sigiri.findingfalcone.databinding.FragmentSearchPlacesBinding
import com.sigiri.findingfalcone.viewmodel.MyViewModelFactory
import com.sigiri.findingfalcone.viewmodel.SearchPlacesViewModel

class SearchPlacesFragment : BaseFragment<SearchPlacesViewModel, FragmentSearchPlacesBinding>(),WidgetCallBack {

    override fun setUpViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSearchPlacesBinding {
        return FragmentSearchPlacesBinding.inflate(inflater, container, false)
    }

    override fun setUpViewModel(): SearchPlacesViewModel {
        val apiInterface = ApiUtils.getRetrofit().create(FalconsApiInterface::class.java)
        val repository = FalconeRepository(apiInterface)
        return ViewModelProvider(
            this,
            MyViewModelFactory(repository)
        )[SearchPlacesViewModel::class.java]
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.unselectedPlanetsList.observe(viewLifecycleOwner) {
            updateSpinner(it)
        }
    }

    private fun updateSpinner(options: List<String>) {
        binding.spinnerItem.spinnerItemParent.updateSpinner(options,this)
    }

    override fun onItemClick(action: AppAction) {
        /* no-op */
    }

}