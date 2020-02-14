package com.example.tableviewtestapp.ui.tableview

import android.graphics.Color
import androidx.recyclerview.widget.RecyclerView
import com.evrencoskun.tableview.listener.ITableViewListener
import com.example.tableviewtestapp.R
import com.example.tableviewtestapp.ui.tableview.viewholders.CellViewHolder

class TableViewListener : ITableViewListener
{
    override fun onCellLongPressed(cellView: RecyclerView.ViewHolder, column: Int, row: Int)
    {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onColumnHeaderLongPressed(columnHeaderView: RecyclerView.ViewHolder, column: Int)
    {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onRowHeaderClicked(rowHeaderView: RecyclerView.ViewHolder, row: Int)
    {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onColumnHeaderClicked(columnHeaderView: RecyclerView.ViewHolder, column: Int)
    {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCellClicked(cellView: RecyclerView.ViewHolder, column: Int, row: Int)
    {
        var vh :CellViewHolder = cellView as CellViewHolder
        vh.setText("a")
    }

    override fun onRowHeaderLongPressed(rowHeaderView: RecyclerView.ViewHolder, row: Int)
    {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}