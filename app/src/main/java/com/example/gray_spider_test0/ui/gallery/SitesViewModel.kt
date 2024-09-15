package com.example.gray_spider_test0.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SitesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Sites Fragment"
    }
    val text: LiveData<String> = _text
}