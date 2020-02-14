package com.example.tableviewtestapp.ui.tableview

import org.joda.time.DateTime

class TableModel()
{
    lateinit var columnHeaderModel: List<ColumnHeaderModel>
    lateinit var rowHeaderModel: List<RowHeaderModel>
    lateinit var cellModel: List<List<CellModel>>

    private fun generateColumnHeader(): List<ColumnHeaderModel>
    {
        var tmp = ArrayList<ColumnHeaderModel>()
        var maxDays = DateTime().dayOfMonth().maximumValue

        for (i in 1..maxDays)
        {
            tmp.add(ColumnHeaderModel(i.toString()))
        }
        return tmp
    }

    private fun generateRowHeader(): List<RowHeaderModel>
    {
        var tmp = ArrayList<RowHeaderModel>()
        tmp.add(RowHeaderModel("Петя\nИванов"))
        tmp.add(RowHeaderModel("Вася\nПетров"))

        return tmp
    }

    private fun generateCellModel(): List<List<CellModel>>
    {
        var tmp = ArrayList<ArrayList<CellModel>>()
        for (i in 1..rowHeaderModel.size)
        {
            var row = ArrayList<CellModel>()
            for (j in 1..columnHeaderModel.size)
            {
                row.add(CellModel(j.toString() + i.toString(), ""))
            }
            tmp.add(row)
        }
        return tmp
    }

    fun fillModel()
    {
        columnHeaderModel = generateColumnHeader()
        rowHeaderModel = generateRowHeader()
        cellModel = generateCellModel()
    }
}