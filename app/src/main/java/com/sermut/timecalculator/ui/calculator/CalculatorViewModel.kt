package com.sermut.timecalculator.ui.calculator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "300y 12mo 51w 6d 23h 59m 59s"
    }
    val text: LiveData<String> = _text
}