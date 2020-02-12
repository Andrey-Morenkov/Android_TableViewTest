package com.example.tableviewtestapp.ui.tableview

import com.evrencoskun.tableview.sort.ISortableModel

class CellModel(private val id: String, private val data: Any) : ISortableModel
{
    override fun getContent() = data
    override fun getId() = id
}

data class ColumnHeaderModel(val data: String)

data class RowHeaderModel(val data: String)