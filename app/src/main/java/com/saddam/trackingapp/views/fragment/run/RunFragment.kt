package com.saddam.trackingapp.views.fragment.run

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.saddam.trackingapp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RunFragment : Fragment(R.layout.fragment_run){

    val viewModel:RunViewModel by viewModels()
}