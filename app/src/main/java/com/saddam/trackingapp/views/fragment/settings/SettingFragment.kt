package com.saddam.trackingapp.views.fragment.settings

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.saddam.trackingapp.R
import com.saddam.trackingapp.views.fragment.setup.SetupViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SettingFragment : Fragment(R.layout.fragment_setting){

    val viewModel: SetupViewModel by viewModels()
}