package com.sh.cccandroidtest.ui.fragments.home

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.sh.cccandroidtest.data.repositories.HomeRepository

class HomeViewModel(application: Application) : AndroidViewModel(application) {
    private val homeRepository = HomeRepository(application)
    val fullEstimate = homeRepository.fullEstimate
}