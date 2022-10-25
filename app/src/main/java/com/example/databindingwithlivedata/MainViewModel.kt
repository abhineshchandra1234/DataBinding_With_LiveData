package com.example.databindingwithlivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val profileLiveData = MutableLiveData("Android Developer")

    fun updateProfile() {
        profileLiveData.value = "Full Stack Developer"
    }
}