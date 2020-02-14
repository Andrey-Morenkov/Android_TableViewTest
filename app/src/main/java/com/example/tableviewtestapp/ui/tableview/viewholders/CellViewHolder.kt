package com.example.tableviewtestapp.ui.tableview.viewholders

import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.evrencoskun.tableview.adapter.recyclerview.holder.AbstractViewHolder
import com.example.tableviewtestapp.R
import com.example.tableviewtestapp.ui.tableview.CellModel
import com.pawegio.kandroid.i

class CellViewHolder(view: View) : AbstractViewHolder(view)
{
    private var content: TextView       = view.findViewById(R.id.cell_data)
    private var container: LinearLayout = view.findViewById(R.id.cell_container)
    private lateinit var cmodel: CellModel

    fun setCellModel(model: CellModel)
    {
        cmodel = model
        renderModel()
    }

    fun setText(string: String)
    {
        cmodel.setData(string)
        renderModel()
    }

    private fun renderText()
    {
        content.text = cmodel.content as String
        content.gravity = Gravity.CENTER_VERTICAL and Gravity.CENTER
        //Resize self
        container.layoutParams.width = LinearLayout.LayoutParams.WRAP_CONTENT
        content.requestLayout()
    }

    private fun colorizeCell()
    {
        i { " color = ${cmodel.color} "}
        if (cmodel.color == 0)
        {
            cmodel.color = Color.parseColor("#D81B60")
        }
        else
        {
            cmodel.color = 0
        }
        container.setBackgroundColor(cmodel.color)
    }

    private fun renderModel()
    {
        renderText()
        colorizeCell()
    }
}