package com.example.databindingwithlivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val profileObject = MutableLiveData("Android Developer")

    fun updateProfile() {
        profileObject.value = "Full Stack Developer"
    }
}