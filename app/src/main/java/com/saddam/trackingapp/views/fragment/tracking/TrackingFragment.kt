package com.saddam.trackingapp.views.fragment.tracking

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.saddam.trackingapp.R
import com.saddam.trackingapp.views.fragment.statistics.StatisticViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class TrackingFragment : Fragment(R.layout.fragment_tracking){

    val viewModel: StatisticViewModel by viewModels()
}