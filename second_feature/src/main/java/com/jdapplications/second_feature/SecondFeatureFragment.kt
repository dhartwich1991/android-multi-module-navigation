package com.jdapplications.second_feature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.second_feature_fragment.view.*


class SecondFeatureFragment : Fragment() {

    companion object {
        fun newInstance() = SecondFeatureFragment()
    }

    private lateinit var viewModel: SecondFeatureViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.second_feature_fragment, container, false)
        view.openThirdFeatureButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.openThirdFeatureAction)
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SecondFeatureViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
