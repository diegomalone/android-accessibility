package com.diegomalone.a11y

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.ViewCompat.ACCESSIBILITY_LIVE_REGION_POLITE
import kotlinx.android.synthetic.main.activity_counter.*

class CounterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        initViews()
    }

    private fun initViews() {
        increaseButton.setOnClickListener {
            updateCounter(true)
        }

        decreaseButton.setOnClickListener {
            updateCounter(false)
        }

         // ViewCompat.setAccessibilityLiveRegion(counterTextView, ACCESSIBILITY_LIVE_REGION_POLITE)
    }

    private fun updateCounter(increase: Boolean) {
        val currentValue = Integer.valueOf(counterTextView.text.toString())

        counterTextView.text = (if (increase) currentValue + 1 else currentValue - 1).toString()
    }
}