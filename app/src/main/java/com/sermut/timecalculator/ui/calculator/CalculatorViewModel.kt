package com.sermut.timecalculator.ui.calculator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {

    private val _yearsText = MutableLiveData<String>().apply {
        value = "000y 00mo 00w 0d"
    }
    private val _daysText = MutableLiveData<String>().apply {
        value = "00h 00m 00s"
    }
    val yearText: LiveData<String> = _yearsText
    val daysText: LiveData<String> = _daysText
}