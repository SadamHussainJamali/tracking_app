package com.saddam.trackingapp.views.fragment.setup

import androidx.lifecycle.ViewModel
import com.saddam.trackingapp.repositories.MainRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class SetupViewModel @Inject constructor(private val repo: MainRepo): ViewModel() {

}