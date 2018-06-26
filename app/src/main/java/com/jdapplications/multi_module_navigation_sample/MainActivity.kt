package com.jdapplications.multi_module_navigation_sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        setupNavigation()
    }

    override fun onSupportNavigateUp() =
            Navigation.findNavController(findViewById(R.id.mainNavigationFragment)).navigateUp()

    private fun setupNavigation() {
        val navController = Navigation.findNavController(findViewById(R.id.mainNavigationFragment))
        NavigationUI.setupActionBarWithNavController(this@MainActivity, navController)
    }

}
