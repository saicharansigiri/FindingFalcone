package com.sigiri.findingfalcone.ui.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.constraintlayout.widget.ConstraintLayout
import com.sigiri.findingfalcone.core.WidgetCallBack
import com.sigiri.findingfalcone.databinding.SpinnerWidgetBinding

class SpinnerWidget @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr), AdapterView.OnItemSelectedListener {

    private lateinit var binding: SpinnerWidgetBinding
    private lateinit var widgetCallBack: WidgetCallBack

    override fun onFinishInflate() {
        super.onFinishInflate()
        binding = SpinnerWidgetBinding.bind(this)
    }

    fun updateSpinner(options: List<String>, widgetCallBack: WidgetCallBack) {
        this.widgetCallBack = widgetCallBack
        val adapter = ArrayAdapter(
            context,
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
            options
        )
        binding.spinnerItem.adapter = adapter
        binding.spinnerItem.onItemSelectedListener = this
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        /* no-op */
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        /* no-op */
    }

}