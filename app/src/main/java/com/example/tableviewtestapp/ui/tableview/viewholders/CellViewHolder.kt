package com.example.tableviewtestapp.ui.tableview.viewholders

import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.evrencoskun.tableview.adapter.recyclerview.holder.AbstractViewHolder
import com.example.tableviewtestapp.R
import com.example.tableviewtestapp.ui.tableview.CellModel

class CellViewHolder(view: View) : AbstractViewHolder(view)
{
    private var content: TextView       = view.findViewById(R.id.cell_data)
    private var container: LinearLayout = view.findViewById(R.id.cell_container)

    fun setCellModel(model: CellModel)
    {
        content.gravity = Gravity.CENTER_VERTICAL and Gravity.CENTER
        content.text    = model.content.toString()

        //Resize self
        container.layoutParams.width = LinearLayout.LayoutParams.WRAP_CONTENT
        content.requestLayout()
    }

    fun setText(string: String)
    {
        content.text = string
    }
}