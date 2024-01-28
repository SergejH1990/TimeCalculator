package com.sermut.timecalculator.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.CheckBox
import com.sermut.timecalculator.R

class TimeCalculatorTextView : View
{
    var yearsTextView : TextView? = null
    var daysTextView : TextView? = null
    private var yearsCheckBox : CheckBox? = null

    constructor(context: Context) : super(context)
    {
        init()
    }

    constructor(context: Context, attribs: AttributeSet) : super(context, attribs)
    {
        init()
    }

    fun init()
    {
        LayoutInflater.from(context).inflate(R.layout.time_calculator_text_view, null, true)

        yearsTextView = findViewById(R.id.years_text_view)
        daysTextView = findViewById(R.id.days_text_view)
        yearsCheckBox = findViewById(R.id.years_checkbox)
    }
}