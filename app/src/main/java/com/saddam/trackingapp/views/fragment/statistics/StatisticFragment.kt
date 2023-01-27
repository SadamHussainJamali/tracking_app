package com.saddam.trackingapp.views.fragment.statistics

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.saddam.trackingapp.R
import com.saddam.trackingapp.views.fragment.setup.SetupViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticFragment : Fragment(R.layout.fragment_statistic){

    val viewModel: SetupViewModel by viewModels()
}