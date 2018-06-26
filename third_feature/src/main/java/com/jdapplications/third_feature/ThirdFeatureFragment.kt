package com.jdapplications.third_feature

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class ThirdFeatureFragment : Fragment() {

    companion object {
        fun newInstance() = ThirdFeatureFragment()
    }

    private lateinit var viewModel: ThirdFeatureViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.third_feature_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ThirdFeatureViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
