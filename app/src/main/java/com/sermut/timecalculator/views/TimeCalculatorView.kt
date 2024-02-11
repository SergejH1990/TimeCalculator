package com.sermut.timecalculator.views

import android.content.Context
import android.util.AttributeSet
import android.widget.Button
import android.widget.LinearLayout
import com.sermut.timecalculator.R

class TimeCalculatorView : LinearLayout
{
    var entryCalculatorTextView : TimeCalculatorTextView? = null
    private var button1 : Button? = null
    private var button2 : Button? = null

    constructor(context: Context) : super(context)
    {
        init()
    }

    constructor(context: Context, attribs: AttributeSet) : super(context, attribs)
    {
        init()
    }

    private fun init()
    {
        inflate(context, R.layout.time_calculator_view, this)
        orientation = LinearLayout.VERTICAL

        entryCalculatorTextView = findViewById(R.id.entry_calculator_text)

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
    }
}