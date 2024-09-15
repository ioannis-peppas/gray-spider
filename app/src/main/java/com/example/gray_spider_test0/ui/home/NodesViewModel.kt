package com.example.gray_spider_test0.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NodesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Nodes Fragment"
    }
    val text: LiveData<String> = _text

}