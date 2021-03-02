package com.enigmacamp.mybasicdagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var car: Car
    private lateinit var resultTextView: TextView
    private lateinit var engineButton: Button
    var isEngineStart = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.result_textView)
        engineButton = findViewById(R.id.engine_button)
        engineButton.setText("Engine Start")
        car = Car()

        engineButton.setOnClickListener {
            if (isEngineStart) {
                resultTextView.setText(car.stop())
                engineButton.setText("Engine Start")
            } else {
                resultTextView.setText(car.start())
                engineButton.setText("Engine Stop")
            }
            isEngineStart = !isEngineStart

        }


    }
}