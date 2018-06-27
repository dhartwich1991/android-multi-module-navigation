package com.jdapplications.fourth_feature

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class FourthFeatureFragment : Fragment() {

    companion object {
        fun newInstance() = FourthFeatureFragment()
    }

    private lateinit var viewModel: FourthFeatureViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fourth_feature_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FourthFeatureViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
