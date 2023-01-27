package com.saddam.trackingapp.views.fragment.setup

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.saddam.trackingapp.R
import com.saddam.trackingapp.views.fragment.statistics.StatisticViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SetupFragment : Fragment(R.layout.fragment_setup){

    val viewModel: SetupViewModel by viewModels()
}