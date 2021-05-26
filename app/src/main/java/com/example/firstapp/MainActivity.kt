package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun bangNe(view: View) {
        val bang = Toast.makeText(this, "BANG! BANG! BANG!", Toast.LENGTH_SHORT)

        bang.show()
    }

    fun countMe(view: View) {
        val countString = textView.text.toString()

        var count: Int = Integer.parseInt(countString)
        count++

        textView.text = count.toString()
    }

    fun randomNumber(view: View) {
        var randomNumber = (0..1000).random()

        textView.text = randomNumber.toString()

    }

    fun randomMe(view: View) {
        val randomIntent = Intent(this, SecondActivity::class.java)
        val countString = textView.text.toString()
        val count = Integer.parseInt(countString)

        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
        startActivity(randomIntent)




    }
}