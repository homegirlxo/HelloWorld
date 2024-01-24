package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var trueButton: Button
    private lateinit var falseButton:Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)
        textView = findViewById(R.id.helloworld)

        trueButton.setOnClickListener{_: View ->
            textView.setText(R.string.true_answer)
        }
        falseButton.setOnClickListener{_: View ->
            textView.setText(R.string.false_answer)
        }
    }
}