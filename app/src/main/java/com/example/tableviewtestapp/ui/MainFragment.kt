package com.example.tableviewtestapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.evrencoskun.tableview.TableView
import com.example.tableviewtestapp.R
import com.example.tableviewtestapp.ui.tableview.TableAdapter
import com.example.tableviewtestapp.ui.tableview.TableViewListener

class MainFragment() : Fragment()
{
    private lateinit var tableView: TableView
    private lateinit var tableAdapter: TableAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        tableView = view.findViewById(R.id.my_TableView)

        tableAdapter = context?.let { TableAdapter(it) }!!
        tableView.adapter = tableAdapter
        tableView.tableViewListener = TableViewListener()

        tableAdapter.renderTable()

        return view
    }
}