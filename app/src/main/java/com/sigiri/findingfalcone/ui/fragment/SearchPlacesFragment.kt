package com.sigiri.findingfalcone.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sigiri.findingfalcone.R
import com.sigiri.findingfalcone.viewmodel.SearchPlacesViewModel

class SearchPlacesFragment : Fragment() {

    companion object {
        fun newInstance() = SearchPlacesFragment()
    }

    private lateinit var viewModel: SearchPlacesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search_places, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SearchPlacesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}