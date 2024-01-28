package com.sermut.timecalculator.ui.calculator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {

    private val _yearsText = MutableLiveData<String>().apply {
        value = "300y 12mo 51w"
    }
    private val _daysText = MutableLiveData<String>().apply {
        value = "6d 23h 59m 59s"
    }
    val yearText: LiveData<String> = _yearsText
    val daysText: LiveData<String> = _daysText
}