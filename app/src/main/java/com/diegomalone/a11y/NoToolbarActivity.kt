package com.diegomalone.a11y

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_no_toolbar.*

class NoToolbarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_no_toolbar)

        btClose.setOnClickListener {
            onBackPressed()
        }
    }
}