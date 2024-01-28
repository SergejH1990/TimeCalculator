package com.sermut.timecalculator.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.CheckBox
import android.widget.LinearLayout
import com.sermut.timecalculator.R

class TimeCalculatorTextView : LinearLayout
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

    private fun init()
    {
        inflate(context, R.layout.time_calculator_text_view, this)

        yearsTextView = findViewById(R.id.years_text_view)
        yearsTextView?.visibility = View.GONE
        daysTextView = findViewById(R.id.days_text_view)
        yearsCheckBox = findViewById(R.id.years_checkbox)

        yearsCheckBox?.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked)
            {
                yearsTextView?.visibility = View.VISIBLE
                return@setOnCheckedChangeListener
            }

            yearsTextView?.visibility = View.GONE
        }
    }
}