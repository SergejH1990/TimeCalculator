package com.sermut.timecalculator.ui.calculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.sermut.timecalculator.databinding.FragmentCalculatorBinding
import com.sermut.timecalculator.views.TimeCalculatorTextView

class CalculatorFragment : Fragment()
{
    private var _binding: FragmentCalculatorBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View 
    {
        val calculatorViewModel = ViewModelProvider(this).get(CalculatorViewModel::class.java)

        _binding = FragmentCalculatorBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TimeCalculatorTextView = binding.timeCalculator
        val textView1: TimeCalculatorTextView = binding.timeCalculator1
        calculatorViewModel.yearText.observe(viewLifecycleOwner)
        {
            textView.yearsTextView?.text = it
            textView1.yearsTextView?.text = it
        }
        calculatorViewModel.daysText.observe(viewLifecycleOwner)
        {
            textView.daysTextView?.text = it
            textView1.daysTextView?.text = it
        }

        return root
    }

    override fun onDestroyView() 
    {
        super.onDestroyView()
        _binding = null
    }
}