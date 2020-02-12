package com.example.tableviewtestapp.ui.tableview.viewholders

import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.evrencoskun.tableview.adapter.recyclerview.holder.AbstractViewHolder
import com.example.tableviewtestapp.R
import com.example.tableviewtestapp.ui.tableview.RowHeaderModel

class RowHeaderViewHolder(view: View) : AbstractViewHolder(view)
{
    private var container: LinearLayout = view.findViewById(R.id.row_header_container)
    private var content: TextView = view.findViewById(R.id.row_header_textview)

    fun setColumnHeaderModel(model: RowHeaderModel)
    {
        content.gravity = Gravity.CENTER and Gravity.CENTER_VERTICAL
        content.text = model.data

        // Resize itself
        container.layoutParams.width = LinearLayout.LayoutParams.WRAP_CONTENT
        content.requestLayout()
    }
}