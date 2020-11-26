package com.sh.cccandroidtest.ui.activities

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.sh.cccandroidtest.data.repositories.MainRepository

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val mainRepostiory = MainRepository(application, viewModelScope)

    fun init() {
        mainRepostiory.init()
    }
}