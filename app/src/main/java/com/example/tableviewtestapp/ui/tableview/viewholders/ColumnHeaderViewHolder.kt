package com.example.tableviewtestapp.ui.tableview.viewholders

import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.evrencoskun.tableview.adapter.recyclerview.holder.AbstractSorterViewHolder
import com.example.tableviewtestapp.R
import com.example.tableviewtestapp.ui.tableview.ColumnHeaderModel

class ColumnHeaderViewHolder(view: View) : AbstractSorterViewHolder(view)
{
    private var container: LinearLayout = view.findViewById(R.id.column_header_container)
    private var content: TextView = view.findViewById(R.id.column_header_textView)

    fun setColumnHeaderModel(model: ColumnHeaderModel)
    {
        content.gravity = Gravity.CENTER and Gravity.CENTER_VERTICAL
        content.text = model.data

        // Resize itself
        container.layoutParams.width = LinearLayout.LayoutParams.WRAP_CONTENT
        content.requestLayout()
    }
}