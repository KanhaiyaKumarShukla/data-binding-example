package com.example.databindingexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// change-2
class MainViewModel:ViewModel() {
    val quoteLiveData =MutableLiveData("I am a Great Coder :)")

    fun updateQuote(){
        quoteLiveData.value="I am a Pro Developer"
    }
}