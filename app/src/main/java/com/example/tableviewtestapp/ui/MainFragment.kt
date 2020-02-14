package com.example.tableviewtestapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.evrencoskun.tableview.TableView
import com.example.tableviewtestapp.R
import com.example.tableviewtestapp.ui.tableview.TableAdapter
import com.example.tableviewtestapp.ui.tableview.TableViewListener
import com.pawegio.kandroid.toast
import com.pawegio.kandroid.w
import kotlinx.coroutines.*

class MainFragment() : Fragment()
{
    private lateinit var tableView: TableView
    private lateinit var tableAdapter: TableAdapter
    private lateinit var testButton: Button

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

        testButton = view.findViewById(R.id.myButton)
        testButton.setOnClickListener {view ->
            testButton.text = "1"
            testButton.isEnabled = false
            GlobalScope.launch(Dispatchers.Main)
            {
                var a: Int = 0
                repeat(8)
                {
                    delay(100000L)
                    a++
                    w("Waiting... $a")
                }

                testButton.text = "2"
                testButton.isEnabled = true
            }
        }

        return view
    }
}