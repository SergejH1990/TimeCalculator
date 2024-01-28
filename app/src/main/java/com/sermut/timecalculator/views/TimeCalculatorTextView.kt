package com.sermut.timecalculator.views

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import android.widget.CheckBox

class TimeCalculatorTextView : View
{
    var yearsTextView : TextView? = null
    var daysTextView : TextView? = null
    private var yearsCheckBox : CheckBox? = null

    constructor(context: Context) : super(context)
    {
        yearsTextView = TextView(context)
        daysTextView = TextView(context)
        yearsCheckBox = CheckBox(context)
    }

    constructor(context: Context, attribs: AttributeSet) : super(context, attribs)
    {
        yearsTextView = TextView(context, attribs)
        daysTextView = TextView(context, attribs)
        yearsCheckBox = CheckBox(context, attribs)
    }
}