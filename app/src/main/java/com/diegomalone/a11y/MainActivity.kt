package com.diegomalone.a11y

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvFocusOrderActivity.setOnClickListener {
            startActivity(Intent(this, FocusOrderActivity::class.java))
        }

        tvNoToolbarActivity.setOnClickListener {
            startActivity(Intent(this, NoToolbarActivity::class.java))
        }

        tvListActivity.setOnClickListener {
            startActivity(Intent(this, ListActivity::class.java))
        }
    }
}