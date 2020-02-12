package com.example.tableviewtestapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tableviewtestapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.activity_container, MainFragment(), MainFragment::class.java.simpleName)
            .commit()
    }
}
