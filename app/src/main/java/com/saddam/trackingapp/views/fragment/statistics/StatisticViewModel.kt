package com.saddam.trackingapp.views.fragment.statistics

import androidx.lifecycle.ViewModel
import com.saddam.trackingapp.repositories.MainRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class StatisticViewModel @Inject constructor(private val repo: MainRepo): ViewModel() {

}