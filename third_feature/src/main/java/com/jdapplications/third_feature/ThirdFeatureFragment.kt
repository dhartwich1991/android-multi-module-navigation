package com.jdapplications.third_feature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.third_feature_fragment.view.*


class ThirdFeatureFragment : Fragment() {

    companion object {
        fun newInstance() = ThirdFeatureFragment()
    }

    private lateinit var viewModel: ThirdFeatureViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.third_feature_fragment, container, false)
        view.thirdFeatureNavigateInternalButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.navigateToSecondScreen)
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ThirdFeatureViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
