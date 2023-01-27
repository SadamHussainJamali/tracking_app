package com.saddam.trackingapp.views.mainActivity

import androidx.lifecycle.ViewModel
import com.saddam.trackingapp.repositories.MainRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(private val repository:MainRepo) : ViewModel() {

}