package com.sermut.timecalculator.views

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView
import com.sermut.timecalculator.R

class TimeCalculatorTextView : LinearLayout
{
    private var yearsCheckBox : CheckBox? = null
    private var yearsLinearLayout : LinearLayout? = null
    var yearsTextView : TextView? = null
    var daysTextView : TextView? = null

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
        inflate(context, R.layout.time_calculator_text_view, this)

        yearsLinearLayout = findViewById(R.id.years_linear_layout)
        yearsLinearLayout?.visibility = View.GONE

        yearsTextView = findViewById(R.id.years_text_view)
        yearsCheckBox = findViewById(R.id.years_checkbox)
        daysTextView = findViewById(R.id.days_text_view)

        yearsCheckBox?.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked)
            {
                yearsLinearLayout?.visibility = View.VISIBLE
                return@setOnCheckedChangeListener
            }

            yearsLinearLayout?.visibility = View.GONE
        }
    }
}