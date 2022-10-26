package com.example.databindingwithlivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val profileObject = MutableLiveData("Android Developer")
    val profileLiveData: LiveData<String> get() = profileObject

    fun updateProfile() {
        profileObject.value = "Full Stack Developer"
    }
}