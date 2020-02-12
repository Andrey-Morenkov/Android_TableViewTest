package com.example.tableviewtestapp.ui.tableview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.evrencoskun.tableview.adapter.AbstractTableAdapter
import com.evrencoskun.tableview.adapter.recyclerview.holder.AbstractViewHolder
import com.example.tableviewtestapp.R
import com.example.tableviewtestapp.ui.tableview.viewholders.CellViewHolder
import com.example.tableviewtestapp.ui.tableview.viewholders.ColumnHeaderViewHolder
import com.example.tableviewtestapp.ui.tableview.viewholders.RowHeaderViewHolder
import java.lang.NullPointerException

class TableAdapter(ctx: Context) : AbstractTableAdapter<ColumnHeaderModel, RowHeaderModel, CellModel>()
{
    private val context = ctx
    private val model = TableModel()

    // ------------- COLUMN HEADER -------------
    override fun onCreateColumnHeaderViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AbstractViewHolder
    {
        val view = LayoutInflater.from(context).inflate(R.layout.tableview_column_header, parent, false)
        return ColumnHeaderViewHolder(view)
    }

    override fun onBindColumnHeaderViewHolder(
        holder: AbstractViewHolder,
        columnHeaderItemModel: ColumnHeaderModel?,
        columnPosition: Int
    )
    {
        val chholder: ColumnHeaderViewHolder = holder as ColumnHeaderViewHolder
        columnHeaderItemModel?.let { chholder.setColumnHeaderModel(it) } ?: throw NullPointerException()
    }
    // ------------- /COLUMN HEADER -------------


    // ------------- ROW HEADER -------------
    override fun onCreateRowHeaderViewHolder(parent: ViewGroup, viewType: Int): AbstractViewHolder
    {
        val view = LayoutInflater.from(context).inflate(R.layout.tableview_row_header, parent, false)
        return RowHeaderViewHolder(view)
    }

    override fun onBindRowHeaderViewHolder(
        holder: AbstractViewHolder,
        rowHeaderItemModel: RowHeaderModel?,
        rowPosition: Int
    )
    {
        val rhholder: RowHeaderViewHolder = holder as RowHeaderViewHolder
        rowHeaderItemModel?.let { rhholder.setColumnHeaderModel(it) } ?: throw NullPointerException()
    }
    // ------------- /ROW HEADER -------------


    // ------------- CELL -------------
    override fun onCreateCellViewHolder(parent: ViewGroup, viewType: Int): AbstractViewHolder
    {
        val view = LayoutInflater.from(context).inflate(R.layout.tableview_cell, parent, false)
        return CellViewHolder(view)
    }

    override fun onBindCellViewHolder(
        holder: AbstractViewHolder,
        cellItemModel: CellModel?,
        columnPosition: Int,
        rowPosition: Int
    )
    {
        val cholder: CellViewHolder = holder as CellViewHolder
        cellItemModel?.let { cholder.setCellModel(it) } ?: throw NullPointerException()
    }
    // ------------- /CELL -------------


    // ------------- CORNER VIEW -------------
    override fun onCreateCornerView(parent: ViewGroup): View
    {
       return  LayoutInflater.from(context).inflate(R.layout.tableview_corner, null, false)
    }
    // ------------- /CORNER VIEW -------------

    override fun getCellItemViewType(position: Int): Int = 0

    override fun getColumnHeaderItemViewType(position: Int): Int = 0

    override fun getRowHeaderItemViewType(position: Int): Int = 0

    fun renderTable()
    {
        model.fillModel()
        setAllItems(model.columnHeaderModel, model.rowHeaderModel, model.cellModel)
    }
}