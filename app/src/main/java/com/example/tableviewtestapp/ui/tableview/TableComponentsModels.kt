package com.example.tableviewtestapp.ui.tableview

import android.graphics.Color
import com.evrencoskun.tableview.sort.ISortableModel

class CellModel(private val id: String, private var data: Any) : ISortableModel
{
    var color: Int = 0

    override fun getContent() = data
    override fun getId() = id

    fun setData(str: String)
    {
        data = str
    }
}

data class ColumnHeaderModel(val data: String)

data class RowHeaderModel(val data: String)